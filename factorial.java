import java.util.Scanner;
public class factorial{
	public static void main(String args[]){
		int i;
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(i=1;i<=num;i++){
			fact=fact*i;
		}
		System.out.println("the factorial is : " + fact);
	}
}