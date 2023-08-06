package box;
public class box{
	public void display(){
		int x = 10;
		int y = 10;
		System.out.println("area is : "+(x+y));
	}
	public static void main(String args[]){
		box obj = new box();
		obj.display();
	}
}