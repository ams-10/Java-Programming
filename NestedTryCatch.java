class NestedTryCatch{
	public static void main(String args[]){
		try{
			try{
			System.out.println("Going to divide by zero");
			int div = 39/0;
			}catch(ArithmeticException e){
				System.out.println(e);
			}
			try{
				int a[]=new int[5];
				System.out.println("Going to insert value above index level of array");
				a[5]= 40;
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}