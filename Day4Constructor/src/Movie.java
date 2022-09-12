
public class Movie {
	
	int yearOfrelease;
	float profit;
	String produserName,actorName;
		
	Movie()//Default constructor
	{
		yearOfrelease =1997;
		profit=12000.00f;
		produserName="Khan";
		actorName="Manoj Bajpeyee";
	}
	Movie(int y,float p, String pr,String a)//parameterized constructor
	{
		yearOfrelease =y;
		profit=p;
		produserName=pr;
		actorName=a;
	}
	/*void acceptDetail(int y,float p, String pr,String a)
	{
		yearOfrelease =y;
		profit=p;
		produserName=pr;
		actorName=a;
	}*/
	void showDetail()
	{
		System.out.println("movie profit is " + profit);
		System.out.println("movie produser name is " + produserName);
		System.out.println("movie actor name is " + actorName);
		System.out.println(" movie year of release is " + yearOfrelease);
	}
	public static void main(String[] args)
	{
		Movie titanic=new Movie();
		System.out.println("titanic object created and initialized");
		titanic.showDetail();
		
		Movie uri=new Movie(2019,23000.00f,"Remo","Raghav");
		System.out.println("uri object created and initialized");
		uri.showDetail();
	}
}
