package interfaceEx;

public class MultipleChild implements MultipleParentA,MultipleParentB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleChild obj=new MultipleChild();
		obj.display();
		obj.drawable();
		obj.printable();
		obj.showable();

	}

	@Override
	public void drawable() {
		// TODO Auto-generated method stub
		System.out.println("drawable");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display");
		
	}

	@Override
	public void printable() {
		// TODO Auto-generated method stub
		System.out.println("printable");
		
	}

	@Override
	public void showable() {
		// TODO Auto-generated method stub
		System.out.println("showable");
		
	}

}
