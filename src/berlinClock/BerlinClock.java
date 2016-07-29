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
//		return "1234";
		
		switch(hours / 5)
		{
		case 0:
			return "OOOO";
		case 1:
			return "ROOO";
		case 2:
			return "RROO";
		case 3:
			return "RRRO";
		case 4:
			return "RRRR";
		default:
			return "";
		}
	}

	public String getBottomHours(int hours)
	{
//		return "1234";
		
		switch(hours % 5)
		{
		case 0:
			return "OOOO";
		case 1:
			return "ROOO";
		case 2:
			return "RROO";
		case 3:
			return "RRRO";
		case 4:
			return "RRRR";
		default:
			return "";
		}
	}

	public String getTopMinutes(int minutes)
	{
//		return "12345678901";
		
		switch(minutes / 15)
		{
		case 0:
			return "OOOOOOOOOOO";
		case 1:
			return "OOROOOOOOOO";
		case 2:
			return "OOROOROOOOO";
		case 3:
			return "OOROOROOROO";
		default:
			return "";
		}
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
