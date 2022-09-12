package exception1.com;
@SuppressWarnings("serial")
class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		super(str);
	}
}
public class TestCostomException1 {

		public static void validate(int age) throws InvalidAgeException{
			if (age<18) {
				throw new InvalidAgeException("str");
			}
			else {
				System.out.println("welcome to vote");
			}
		}
	public static void main(String[] args)  {
	
		try {
			validate(19);
		}
		catch(InvalidAgeException ex) {
			System.out.println(ex);
		}
		int a ,b,c;
		a=5;
		b=6;
		c=a+b;
		System.out.println("rest of the code......"+c);
	}

}
