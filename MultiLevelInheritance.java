//multi level inheritance
class grandParent{
	void show1(){
		System.out.println("method of grandparent");
	}
}
class parent extends grandParent{
	void show2(){
		System.out.println("method of parent");
	}
}
class child extends parent{
	void show3(){
		System.out.println("method of child");
	}
}
public class MultiLevelInheritance{
	public static void main(String args[]){
		child obj =  new child();
		obj.show1();
		obj.show2();
		obj.show3();
	}
}