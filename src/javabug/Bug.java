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
		int random = (int) (Math.random() * 4);
		switch (random) {
		case 0:
			Xpos++;
		case 1:
			Xpos--;
		case 2:
			Ypos++;
		case 3:
			Ypos--;
		}

	}

	public String myPos() {
		return "I am at Position: " + this.Xpos + "," + this.Ypos;
	}

}
