import java.io.*;
public class bufferedReader{
	public static void main(String args[]){
		String var1,var2;
			System.out.println("Enter any 5 numbers ");
		InputStreamReader stdin = new InputStreamReader(System.in);
		BufferedReader console = new BufferedReader(stdin);
		int x[] = new int [4];
		int y[] = new int[4];
		int z[] =  new int[4];
		for(int i = 0 ; i < 5 ;i++){
			try{
				var1 = console.readLine();
				x[i] = Integer.parseInt(var1);
			}
			catch(IOException e){}
		System.out.println("enter five no.s in second array");
		try{
			for(i=0 ; i<5 ; i++){
				var2 = console.readLine();
				y[i] = Integer.parseInt(var2);
				z[i] = x[i] + y[i];
			}
		}catch(IOException e){}
		System.out.println("the resultant array");
		for(i=0;i<5;i++){
			System.out.println(z[i]);
		}
		}
			
	}
}