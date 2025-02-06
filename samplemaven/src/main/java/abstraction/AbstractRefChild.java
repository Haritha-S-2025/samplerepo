package abstraction;

public class AbstractRefChild extends AbstractionRefParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionRefParent obj=new AbstractRefChild();//reference creation
		AbstractRefChild obj1=new AbstractRefChild();//object creation
		obj.printable();
		obj.showable();
		obj1.draw();
		

	}

	@Override
	public void printable() {
		// TODO Auto-generated method stub
		System.out.println("printable");
		
	}
	public void draw()
	{
		System.out.println("draw");
	}

}
