package abstraction;

public class AbstractionChild extends AbstractionParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionChild obj=new AbstractionChild();
		obj.display();
		obj.show();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println("sum is : "+c);
		
	}

}
