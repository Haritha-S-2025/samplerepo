package interfaceEx;

public class Interface2 implements Interface1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 obj=new Interface2();//object creation
		Interface1 obj1=new Interface2();//refrence creation
		obj1.display();
		obj.show();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display");
		
	}
	public void show()
	{
		System.out.println("show");
	}

}
