
public class Methods {
	public static void main(String[] args) {
		sayHelloWorld();
		
		sayHelloTo("Charles");
		sayHelloTo("Mary");
		
		int x = returnFive();
		System.out.println(x);
		
		int result = square(10);
		System.out.println("The result of the square is " + result);
		
		int result2 = square (return20());
		System.out.println("Reusing a method is " + result2);

	}
	
	static int square (int x) {
		return (x * x);
	}
	
	//create method
	static void sayHelloWorld() {
		System.out.println("Hello world!");
	}
	
	// param name
	static void sayHelloTo (String name) {
		System.out.println("Good morning, " + name +"!");
	}
	
	//return integer
	static int returnFive() {
		return 5;
	}
	
	
	//return method
	static int return20() {
		return 20;
	}
	
	
}
