import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenizerDemo{
	public static void main(String args[]){
		int sum = 0;
		System.out.println("Enter numbers separated by comma");
		Scanner sc = new Scanner(System.in);
		String mystr =  sc.next();
		StringTokenizer tokenizer = new StringTokenizer(mystr,",");
		while(tokenizer.hasMoreTokens()){
			String mystr2 = tokenizer.nextToken();
			int x = Integer.parseInt(mystr2);
			sum += x;
		}
		System.out.println("Sum is : " + sum);
	}
}