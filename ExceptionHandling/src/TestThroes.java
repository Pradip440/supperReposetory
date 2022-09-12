class AgeIsNotAppExcetion extends RuntimeException{
	AgeIsNotAppExcetion(String s){
		System.out.println("age is not applicable for vaccine");
	}
}
class TestThrows  {
	int age;
	TestThrows(int a) {
			age=a;
		}
	public void checkEligibility() {
		if (age >18) {
			System.out.println("person is eligible for vaccinn");
		}
		else {
			System.out.println("person is not eligible for vaccinn");
		}
	}
	void display() {
		System.out.println(age);
	}
}
public class TestThroes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThrows t=new TestThrows(4);
	//	Try{
			t.checkEligibility();
	//	}
		//catch() {
			
		//}
	}

}
