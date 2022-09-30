

public class CheckPassword extends Exception
{ 
	public static void passwordValid(String s) throws CheckPassword  {
		if(s=="abc@") {
			throw new  CheckPassword();
		}
		else
			System.out.println("password is Incorect");
	}
public static void main(String[] args) {

		try {
			passwordValid("abc@");
		}
		catch(CheckPassword c) {
			System.out.println("exception is handled");
		}
	}

}
