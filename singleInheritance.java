//single level inheritance
class Parent{
	void print(){
		System.out.println("method of parent class");
	}
}
class child extends Parent{
	void show(){
		System.out.println("method of child class");
	}
}

public class singleInheritance{
	public static void main(String args[]){
		child obj = new child();
		obj.print();
		obj.show();
	}
}