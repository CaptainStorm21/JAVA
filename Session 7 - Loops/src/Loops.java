
public class Loops {
	public static void main(String[] args) {
		
		doWhileLoop();
		whileLoop();
		forLoop();
		
	}
	
	static void whileLoop() {
		int counter = 0;
		while (counter < 10) {
			counter = counter + 1;
			System.out.println("Counter while loop output is " + counter);
		}
	}
		
	static void doWhileLoop() {
		int counter = 10;
		do {
			counter = counter + 3;
			System.out.println("Do while Loop " + counter);
		} while (counter < 40);
	}
	
	static void forLoop() {
		for (int x=0; x<10; x++) {
			System.out.println("for loop " + x);
		}
	}

}
