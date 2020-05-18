

public class LeapYear2 extends Year {
	public LeapYear2()
	{
		//set Number of Days to 366
		setNumberofdays(360);
	}
	public int daysElapsed(int day, int month)
	{
		int temp = 0;
		
		for (int i = 1; i < month; i++) {
			
			//Check for Month
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				temp += 31;
			}
			
			//Jan, Mar, May, Jul, Aug, Oct, Dec
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				temp += 30;
			}
			
			//Apr Jun Sep Nov
			else if (i == 2)
			{
				temp += 29;
			}
		}
	temp += day;
	return temp;
	}
	
}
