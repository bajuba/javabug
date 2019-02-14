package javabug;

import java.util.Scanner;  



class Main
{
	
	public static void main(String[] args) {
		// System.out.println("Hello");

		Stage myStage = new Stage();

		Bug tim = new Bug();
		myStage.stuff.add(tim);
		
		Scanner scanner = new Scanner (System.in);

		
		/*
		//world loop render loop
		while(true)
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n");
			myStage.drawStuff();
			System.out.println(myStage.drawAboveStage());
			
		    //System.out.println("");
			tim.moveRandom();
			//System.out.println(tim.myPos());
			scanner.nextLine();
		}
		*/
	}
}

