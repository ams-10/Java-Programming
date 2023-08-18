class Demo{
	void calculate(){
		int a=10 , b=0;
		try{
			int div = a/b;
			System.out.println("this statement does not print as ArithmeticException occurs ");
		}catch(ArithmeticException e){
			System.out.println(e);
		}finally{
			System.out.println("This statement in the finally block is executed wether exception occurs or not");
		}
	}
}
public class tryCatch{
	public static void main(String args[]){
		Demo obj =new Demo();
		obj.calculate();
	}
}