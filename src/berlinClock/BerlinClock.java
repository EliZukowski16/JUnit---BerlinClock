package berlinClock;

public class BerlinClock
{

	public String getSeconds(int seconds)
	{
		switch(seconds % 2)
		{
		case 0:
			return "Y";
		case 1:
			return "O";
		default:
			return "";
		}
	}

	public String getTopHours(int hours)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public String getBottomHours(int hours)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public String getTopMinutes(int minutes)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public String getBottomMinutes(int minutes)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public String[] convertToBerlinTime(String time)
	{
		// TODO Auto-generated method stub
		return null;
	}
	

}
