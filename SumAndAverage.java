package SumAndAverage;
import java.util.Scanner;
class SumAndAverage{
	public static void main(String args[]){
		System.out.println("Enter the number of inputs : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i=0 ; i<n ; i++){
			System.out.println("Enter the numbers to add : "+(i+1)+" : ");
			int num = sc.nextInt();
			sum += num;
		}
		System.out.println("Sum of the number : "+sum);
		double avg = sum/n;
		System.out.println("average of the numbers : "+avg);
	}
}
