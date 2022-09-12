package Enum;

enum Day{
	Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saterday
}
public class WeekDay {
	Day d;
	//constructor
	 WeekDay(Day d) {
		this.d=d;
	}
	public void DayAre() {
	switch(d) {
	case Monday:
		System.out.println("start of work  " + d.name()+d.ordinal());
		break;
	case Friday:
		System.out.println("its friday  " + d.ordinal());
		break;
	case Saterday:
	case Sunday:
		System.out.println(" its Holyday " + d.name()+" "+ d.ordinal());
		break;
	default:
		System.out.println("midDay are Boring");
		break;
	}
	
	}

	public static void main(String[] args) {
		
		String str="Sunday";
		WeekDay w=new WeekDay(Day.valueOf(str));
		w.DayAre();

	}

}
