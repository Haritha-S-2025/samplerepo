package aggregation;

public class Aggregation2 {
	
	
	String city;
	String state;
	Aggregation1 ref;
	public Aggregation2(String city,String state,Aggregation1 ref)
	{
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
	
	public void display()
	{
		System.out.println(ref.name+" "+ref.rollno);
		System.out.println(city+" "+state);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregation1 obj=new Aggregation1("HARITHA",18,23);
		Aggregation2 obj1=new Aggregation2("KOLLAM","KERALA",obj);
		obj1.display();
		

	}

}
