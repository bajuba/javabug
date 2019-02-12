package javabug;

public class Bug {
	char body = '§';
	int Xpos = 0;
	int Ypos = 0;

	Bug() {

	}

	Bug(char inputBody, int X, int Y) {
		this.body = inputBody;
		this.Xpos = X;
		this.Ypos = Y;
	}

	public void think() {
		moveRandom();
	}

	public void moveRandom() {
		int randomX = (int) (Math.random() * 3 - 1);
		int randomY = (int) (Math.random() * 3 - 1);
		if (randomX == -1 && Xpos != 0)
			Xpos--;
		if (randomX == 1 && Xpos != 10)
			Xpos++;
		if (randomY == -1 && Ypos != 0)
			Ypos--;
		if (randomY == 1 && Ypos != 10)
			Ypos++;

	}

	public String myPos() {
		return "I am at Position: " + this.Xpos + "," + this.Ypos;
	}

}
