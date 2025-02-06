package exceptionhandling;

public class ThrowEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=12;
		if(age>18)
		{
			System.out.println("eligible for voting");
		}
		else
		{
			throw new ArithmeticException("age is under 18");
		}

	}

}
