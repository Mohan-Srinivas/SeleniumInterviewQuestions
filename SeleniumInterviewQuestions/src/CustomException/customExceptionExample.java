package CustomException;

public class customExceptionExample
{
	static void validateAge(int age) throws InvalidAgeExeception
	{
		if(age<18)
			throw new InvalidAgeExeception("not elligible for voting");
		else
			System.out.println("Eligible for Vote");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			validateAge(18);
			validateAge(10);
		}
		catch(InvalidAgeExeception e)
		{
			System.out.println("Exception occured "+e);
		}
	}

}
