package exceptionhandling;

public class CustomException {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
		int age=12;
		if(age>18)
		{
			System.out.println("eligible for voting");
		}
		else
		{
			throw new VotingException("under 18");
		}

	}

}
