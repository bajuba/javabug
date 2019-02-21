package javabug;

public class CarnivoreBug extends Bug {
	
	CarnivoreBug(String inputBody, int X, int Y) {
		super(inputBody, X, Y);
	}
	
	
	public int eatBug() {
		int feeling = 0;
		int checkX = 0;
		int checkY = 0;
		//-1,-1
		if(this.Xpos != 0 && this.Ypos != 0 )
			if(myStage.aboveStage[this.Xpos-1][this.Ypos-1] == "X")
			{
				feeling = 1;
				return feeling;
			}
	}
}
		