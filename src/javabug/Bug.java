package javabug;

import java.util.Random; 
import java.lang.Math.*;

public class Bug extends Stuff {
	int belly = 50;
	int maxBelly = 100;

	

	Bug(String inputBody, int X, int Y) {
		super(inputBody, X, Y);
	}

	public void think(Stage myStage) {
		if(look(myStage)==0)
			moveRandom();
		else if(look(myStage)==1)
			moveRandom();
		else if(look(myStage)==2)
			moveRandom();
		else if(look(myStage)==3)
			moveRandom();
	}
	
	public int look(Stage myStage){
		int feeling = 0;
		return feeling;
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

	public String myPos() {
		return "I am at Position: " + this.Xpos + "," + this.Ypos;
	}

}
