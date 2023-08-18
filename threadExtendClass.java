class Mythread extends Thread{
	public void run(){
		for(int i = 0; i<6 ; i++){
			System.out.println("Thread execution using thread extend this is the unit of thread");
		}
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
public class threadExtendClass{
	public static void main(String args[]){
	Mythread obj = new Mythread();
	obj.start();
	}
}