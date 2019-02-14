package javabug;

public class Stuff {
	String[][] stage = new String[11][11];
	
	
	Stuff()
	{
		for(int i = 0; i<=10; i++ )
		{
			for(int j =0; j<=10;j++)
			{
				this.stage[i][j] = "";
			}
		}
	}
	
	public String draw()
	{
		String result = "";
		for(int i = 0; i<=10; i++ )
		{
			
			for(int j =0; j<=10;j++)
			{
				result += this.stage[i][j];
				
			}
			result += "\n";
		}
		return result;
	}
	
}
