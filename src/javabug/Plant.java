package javabug;

public class Plant extends Stuff {

	int leaves = 1;
	int maxLeaves = 5;
	int growth = 0;
	
	Plant(String inputBody, int X, int Y) {
		super(inputBody, X, Y);
	}
	
	public void grow(){
		if(growth > 10 && leaves < maxLeaves)
		{
			leaves++;
			growth=0;
		}
		else
		{
			growth++;
		}
	}
}
