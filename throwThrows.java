class Demo{
	void age(int n)throws ArithmeticException{
		if(n<18){
			throw new ArithmeticException("Inelegible");
		}else{
			System.out.println("Eligible");
		}
	}
}
public class throwThrows{
	public static void main(String args[]){
		Demo obj = new Demo();
		obj.age(16);
	}
}