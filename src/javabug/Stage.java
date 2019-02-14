package javabug;

import java.util.*;

public class Stage 
{
	String[][] stage = new String[11][11];
	String[][] aboveStage = new String [11][11];
	String blankGround=".";
	ArrayList<Bug> stuff = new ArrayList<Bug>(1);
	
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
	public void drawStuff()
	{
		//draw the stage into stuff (copy stage into stuff)
		copyStage();
		this.stuff.forEach((n) -> addBug(n));
		

	}
	public void addBug(Bug myBug)
	{
	  this.aboveStage[myBug.Xpos][myBug.Ypos] = myBug.body;	
	}
	//copy stage into aboveStage
	public void copyStage()
	{
	for(int i=0; i<stage.length; i++)
		  for(int j=0; j<stage[i].length; j++)
		    stage[i][j]=aboveStage[i][j];
	}
	public String drawAboveStage()
	{
		String result = "";
		for(int i = 0; i<=10; i++ )
		{
			
			for(int j =0; j<=10;j++)
			{
				
					result += this.aboveStage[i][j];
			
			}
			result += "\n";
		}
		return result;
	}
}
