package javabug;

import java.util.*;

public class Stage 
{
	String[][] stage = new String[11][11];
	String[][] aboveStage = new String [11][11];
	String blankGround=".";
	ArrayList<Stuff> stuff = new ArrayList<Stuff>(2);
	
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
		this.stuff.forEach((n) -> addStuff(n));
		

	}
	public void addStuff(Stuff myStuff)
	{
	  this.aboveStage[myStuff.Xpos][myStuff.Ypos] = myStuff.body;	
	}
	//copy stage into aboveStage
	public void copyStage()
	{
	for(int i=0; i<stage.length; i++)
		  for(int j=0; j<stage[i].length; j++)
		  {
			 aboveStage[i][j]=stage[i][j];
		  }
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
//	public Stuff nearestPlant(int x, int y)
//	{
//		
//		return yourPlant;
//	}
	
}
