
class synchThreads{
	public static void main(String args[]){
		Demo obj1 = new Demo(2,3);
		Demo obj2 = new Demo(2,1);
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.setName("Abdullah");
		t2.setName("Salman");
		t1.start();
		t2.start();
	}
}
class Demo implements Runnable{
	int wanted;
	int available;
	Demo(int i, int j){
		wanted = i;
		available = j;
	}
	public void run(){
		synchronized(this){
			System.out.println("Available fruits : "+available);
		if(available>=wanted){
			String name = Thread.currentThread().getName();
			System.out.println(wanted + "fruits reserved for " + name);
			try{
				Thread.sleep(1000);
				available = available - wanted;
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}else{
				System.out.println("Sorry no fruits available");
			}
	}
		}
}
