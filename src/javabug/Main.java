package javabug;

import java.util.Scanner;

class Main
{
	
	public static void main(String[] args) {
		// System.out.println("Hello");

		Stage myStage = new Stage();

		
		
		Bug tim = new Bug();
		Scanner scanner = new Scanner (System.in);
		while(true) {
			tim.moveRandom();
			System.out.println(tim.myPos());
			scanner.nextLine();
		}
		Scanner scanner = new Scanner(System.in);  // Create a Scanner object
		
		//world loop render loop
		while(true)
		{
		System.out.println(myStage.draw());
		
	    //System.out.println("");
		tim.moveRandom();
		//System.out.println(tim.myPos());
		scanner.nextLine();
		}
	}
}

