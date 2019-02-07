package javabug;

public class Stage 
{
	String[][] stage = new String[11][11];
	String blankGround=".";
	
	Stage()
	{
		for(int i = 0; i<=10; i++ )
		{
			for(int j =0; j<=10;j++)
			{
				this.stage[i][j] = blankGround;
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
