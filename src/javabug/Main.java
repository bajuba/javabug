package javabug;

import java.util.Scanner;  



class Main
{
	
	public static void main(String[] args) {
		// System.out.println("Hello");

		Stage myStage = new Stage();

		Bug bug1 = new Bug("X",0,0);
		myStage.stuff.add(bug1);
		
		Plant plant1 = new Plant("Y", 5, 5); 
		myStage.stuff.add(plant1);
		
		Scanner scanner = new Scanner (System.in);

		
		
		//world loop render loop
		while(true)
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n");
			myStage.drawStuff();
			System.out.println(myStage.drawAboveStage());
			
		    //System.out.println("");
			bug1.think();
			plant1.grow();
			//System.out.println(tim.myPos());
			//scanner.nextLine();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

