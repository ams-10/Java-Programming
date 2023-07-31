import java.io.*;
public class bufferedReader{
	public static void main(String args[]){
		InputStreamReader stdin = new InputStreamReader(System.in);
		BufferedReader console = new BufferedReader(stdin);
		int x[] = new int [5];
		int y[] = new int[5];
		int z[] =  new int[5];
		for(int i = 0 ; i < 5 ;i++){
			try{
				var1 = console.readline();
				x[i] = Integer.parseInt(str1);
			}
			catch(IOException e){}
		System.out.println("Enter any 5 numbers ");
		try{
			for(int i=0 ; i<5 ; i++){
				var2 = console.readline();
				y[i] = console.Integer.parseInt();
				z[i] = x[i] + y[i];
			}
		}catch(IOException e)
		System.out.println("the resultant array");
		for(int i=0;i<5;i++){
			System.out.println(z[i]);
		}
		}
			
	}
}