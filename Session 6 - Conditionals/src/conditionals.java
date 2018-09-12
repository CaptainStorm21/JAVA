
public class conditionals {
	public static void main( String[] args) {
		
		boolean sayHello = false;
		
		// if (expression == true)
		// do something
		
		if (sayHello) {
			System.out.println("Good Morning");
		} else {
			System.out.println("Good Evening");
		}
		
		
		int player1 = 90;
		int player2 = 23;
		int player3 = 32;
		int player4 = 12;
		
		if (player1 > player4 || player2 > player4) {
			System.out.println("Players 1 and 2 are more successfull than player 4");
		} else {
			System.out.println("Player 4 is awesome!");
		}
		
		int Canada = 900;
		int USA = 231;
		int France = 344;
		int Austria = 341;
		
		if(Canada < 281) {
			System.out.println("Canada");
		} else if (USA > 23) {
			System.out.println("USA");
		} else {
			System.out.println("It is either France or Austria");
		}
		
	}
}
