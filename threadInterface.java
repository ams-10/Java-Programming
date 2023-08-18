class Mythread implements Runnable{
	public void run(){
		for(int i=0;i<=5;i++){
			System.out.println("this is the unit of thread implemented using thread interface");
		}
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
class threadInterface{
	public static void main(String args[]){
		Mythread obj = new Mythread();	
		Thread thread = new Thread(obj);
		thread.start();
	}
}