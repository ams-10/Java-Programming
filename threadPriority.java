class A extends Thread{
	public void run(){
		System.out.println("Thread one ....");
		for(int i=0;i<=5;i++){
			System.out.println("\t Thread A : "+i);
		}
	}
}

class B extends Thread{
	public void run(){
		System.out.println("Thread two ....");
		for(int k=0;k<=5;k++){
			System.out.println("\t Thread B : "+k);
		}
	}
}

public class threadPriority{
	public static void main(String args[]){
		A obja = new A();
		B objb = new B();
		obja.setPriority(1);
		objb.setPriority(10);
		obja.start();
		objb.start();
	}
}
