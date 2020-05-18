
public class Year {
	int numberofdays;
	public void getNumberofdays()
	{
		//Display number of days
		System.out.println(numberofdays);
	}
	public void setNumberofdays(int numberofdays)
	{
		//Sets the value of numberofdays
		this.numberofdays = numberofdays;
	}
	
	public Year()
	{
		//Sets to 365
		setNumberofdays(365);
	}
}
