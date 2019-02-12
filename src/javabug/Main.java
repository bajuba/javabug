package javabug;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Hello");

		Stage myStage = new Stage();
		System.out.println(myStage.draw());

		Bug tim = new Bug();
		for (int i = 0; i < 5; i++) {
			tim.moveRandom();
			System.out.println(tim.myPos());
		}
	}
}
