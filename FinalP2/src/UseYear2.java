public class UseYear2 {
	public static void main(String[] args)
	{
		int day = 2, month = 3;
		//Year class Initialization
		Year2 year = new Year2();
		//LeapYear class Initialization
		LeapYear2 leapyear = new LeapYear2();
		//Display Days Elapsed
		System.out.println
			("Days elapsed in a Year = " + year.daysElapsed(day, month));
		System.out.println
			("Days elapsed in a Leap Year = " + leapyear.daysElapsed(day, month));
		
	}
}
