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
			switch(minutes / 5)
			{
			case 0:
				return "OOOOOOOOOOO";
			case 1:
				return "YOOOOOOOOOO";
			case 2:
				return "YYOOOOOOOOO";	
			default:
				return "";
			}
		case 1:
			switch((minutes - 15) / 5)
			{
			case 0:
				return "YYROOOOOOOO";
			case 1:
				return "YYRYOOOOOOO";
			case 2:
				return "YYRYYOOOOOO";
			default:
				return "";
			}
		case 2:
			switch((minutes - 30) / 5)
			{
			case 0:
				return "YYRYYROOOOO";
			case 1:
				return "YYRYYRYOOOO";
			case 2:
				return "YYRYYRYYOOO";
			default:
				return "";
			}
		case 3:
			switch((minutes - 45) / 5)
			{
			case 0:
				return "YYRYYRYYROO";
			case 1:
				return "YYRYYRYYRYO";
			case 2:
				return "YYRYYRYYRYY";
			default:
				return "";
			}
		default:
			return "";
		}
	}

	public String getBottomMinutes(int minutes)
	{
//		return "1234";
		
		switch(minutes % 5)
		{
		case 0:
			return "OOOO";
		case 1:
			return "YOOO";
		case 2:
			return "YYOO";
		case 3:
			return "YYYO";
		case 4:
			return "YYYY";
		default:
			return "";
		}
	}

	public String[] convertToBerlinTime(String time)
	{
		// TODO Auto-generated method stub
		return null;
	}
	

}
