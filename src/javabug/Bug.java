package javabug;

public class Bug {
	char body = '�';
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
		// increase x and y -1, 0, or 1
		int randomx = (int) (Math.random() * 3 - 1);
		int randomy = (int) (Math.random() * 3 - 1);
		//System.out.println(randomx); //DEBUG
		//System.out.println(randomy); //DEBUG

		if (randomx == -1) {
			Xpos--;
		}
		if (randomx == 1)  {
			Xpos++;
		}
		if (randomy == -1) {
			Ypos--;
		}
		if (randomy == 1) {
			Ypos++;
		}
		if (Xpos == -1 || Ypos == -1) {
			Xpos++;
			Ypos++;
		}
		if (Ypos == 10 || Xpos == 10) {
			Xpos--;
			Ypos--;
		}
	}

	public String myPos() {
		return "I am at Position: " + this.Xpos + "," + this.Ypos;
	}

}
