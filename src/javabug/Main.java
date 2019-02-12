package javabug;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
