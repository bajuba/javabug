package javabug;

import java.util.Scanner;

class Main
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		
		Stage myStage = new Stage();
		System.out.println(myStage.draw());
		
		Bug tim = new Bug();
		Scanner scanner = new Scanner (System.in);
		while(true) {
			tim.moveRandom();
			System.out.println(tim.myPos());
			scanner.nextLine()
		}
		tim.moveRandom();
		System.out.println(tim.myPos());
		tim.moveRandom();
		System.out.println(tim.myPos());
		tim.moveRandom();
		System.out.println(tim.myPos());
		tim.moveRandom();
		System.out.println(tim.myPos());
		tim.moveRandom();
		System.out.println(tim.myPos());
		tim.moveRandom();
		System.out.println(tim.myPos());
		tim.moveRandom();
		System.out.println(tim.myPos());
		tim.moveRandom();
		System.out.println(tim.myPos());
		tim.moveRandom();
		System.out.println(tim.myPos());
		tim.moveRandom();
		System.out.println(tim.myPos());
		tim.moveRandom();
		System.out.println(tim.myPos());
		tim.moveRandom();
		System.out.println(tim.myPos());
		tim.moveRandom();
		System.out.println(tim.myPos());
		tim.moveRandom();
		System.out.println(tim.myPos());
		
	}
}
