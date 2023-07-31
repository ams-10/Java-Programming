import java.util.*;
public class prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(system.in);
		System.out.println("enter number to check if prime or not : ");
		int inpt = sc.nextInt();
		if(isprime(inpt)){
			System.out.println("the no. is prime");
		}else{
			System.out.println("the no. is not prime");
		}
	}
	
	static boolean isprime(int num){
		if(num<=1){
			return false;
		}
		for(int i=2 ; i<= num/2 ; i++){
			if((num%i) == 0){
				return false;
			}else{
				return true;
			}
		}
	}
}