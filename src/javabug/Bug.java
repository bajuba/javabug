package javabug;

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
		
		
	}
	public String myPos()
	{
		return "I am at Position: " + this.Xpos + "," + this.Ypos; 
	}
	
	
}
