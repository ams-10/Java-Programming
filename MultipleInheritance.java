interface One{
	public void print_one();
}
interface Two{
	public void print_two();
}
class Three implements One,Two{
	public void print_one(){
		System.out.println("hello ");
	}
	public void print_two(){
		System.out.println("world");
	}
}
class MultipleInheritance{
	public static void main(String args[]){
		Three obj = new Three();
		obj.print_one();
		obj.print_two();
	}
}