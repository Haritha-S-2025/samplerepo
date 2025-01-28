package inheritance;

public class HierarchialChildB extends HierarchialParent {
	public void display2()
	{
		System.out.println("this is the child B");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialChildB obj=new HierarchialChildB();
		obj.display();
		obj.display2();

	}

}
