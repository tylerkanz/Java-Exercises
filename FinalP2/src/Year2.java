

public class Year2 {
	int numberofdays;
	
	public void getNumberofdays()
	{
		//Display number of days
		System.out.println(numberofdays);
	}
	
	public void setNumberofdays (int numberofdays)
	{
		this.numberofdays = numberofdays;
	}
	
	public Year2()
	{
		setNumberofdays(365);
	}
	
	public int daysElapsed (int day, int month)
	{
		int temp = 0;
		
		for (int i = 1; i < month; i++)
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
				temp += 28;
			}
		temp += day;
		return temp;
		}
	}
