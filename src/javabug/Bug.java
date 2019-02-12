package javabug;

import java.util.Random; 
import java.lang.Math.*;

public class Bug {
	char body = '§';
	int Xpos = 0;
	int Ypos = 0;
	
	Bug()
	{
		
	}
	Bug(char inputBody, int X, int Y)
	{
		this.body = inputBody;
		this.Xpos = X;
		this.Ypos = Y;
	}
	public void think()
	{
		moveRandom();
	}
	public void moveRandom()
	{
		//increase x and y -1, 0, or 1
		Random rand = new Random();
		
		int rand_int1 = rand.nextInt(3)-1;
		int rand_int2 = rand.nextInt(3)-1;
		int newX =this.Xpos + rand_int1;
		int newY =this.Ypos + rand_int2;
		if(newX > 9)
		{
			newX = 9;
		}
		if(newY > 9)
		{
			newY = 9;
		}
		if(newX < 0)
		{
			newX = 0;
		}
		if(newY < 0)
		{
			newY = 0;
		}
		this.Xpos = newX;
		
		this.Ypos = newY;
		
	}
	public String myPos()
	{
		return "I am at Position: " + this.Xpos + "," + this.Ypos; 
	}
	
	
}
