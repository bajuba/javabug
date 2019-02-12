package javabug;

class Main
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		
		Stage myStage = new Stage();
		System.out.println(myStage.draw());
		
		Bug tim = new Bug();
		tim.moveRandom();
		System.out.println(tim.myPos());
		
	}
}
