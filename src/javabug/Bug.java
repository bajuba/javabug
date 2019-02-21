package javabug;
import java.util.*;
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
			eatPlant(myStage.nearestPlant(Xpos,Ypos));
		else if(look(myStage)==2)
			moveRandom();
		else if(look(myStage)==3)
			moveRandom();
	}
	
	public int look(Stage myStage){
		int feeling = 0;
		//check the 8 spaces around you
		//generate coordinates
		int checkX = 0;
		int checkY = 0;
		//ArrayList<Integer> coords = new ArrayList<Integer>(2);
		//ArrayList<ArrayList<Integer>> coordList = new ArrayList<ArrayList<Integer>>(8);
		
		//-1,-1
		if(this.Xpos != 0 && this.Ypos != 0 )
			if(myStage.aboveStage[this.Xpos-1][this.Ypos-1] == "Y")
			{
				feeling = 1;
				return feeling;
			}
			
		//0,-1
		if(this.Ypos != 0 )
			if(myStage.aboveStage[this.Xpos 0][this.Ypos-1] == "Y")
			{
				feeling = 1;
				return feeling;
			}
		//1,-1
		if(this.Xpos != 0 && this.Ypos != 0 )
			if(myStage.aboveStage[this.Xpos1][this.Ypos-1] == "Y")
			{
				feeling = 1;
				return feeling;
		//1, 0
		if(this.Xpos != 0 )
			if(myStage.aboveStage[this.Xpos-1][this.Ypos 0] == "Y")
			{
				feeling = 1;
				return feeling;
			}
				
		//1, 1
		if(this.Xpos != 0 && this.Ypos != 0 )
			if(myStage.aboveStage[this.Xpos 1][this.Ypos 1] == "Y")
			{
				feeling = 1;
				return feeling;
							}
		//0, 1
<<<<<<< HEAD
		if(this.Xpos != 0 && this.Ypos != 0 )
			if(myStage.aboveStage[this.Xpos 0][this.Ypos 1] == "Y")
			{
				feeling = 1;
				return feeling;
							}
=======
		if(this.Ypos != 0 )
			if(myStage.aboveStage[this.Xpos][this.Ypos-1] == "Y")
			{
				feeling = 1;
				return feeling;
			}
>>>>>>> ec1396a70877f5d7619fe7a086996e23bc449297
		//-1,-1
		
		//-1, 0
		
		//set int to 1 if food is found
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
