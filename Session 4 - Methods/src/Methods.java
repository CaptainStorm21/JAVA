
public class Methods {
	public static void main(String[] args) {
		sayHelloWorld();
		
		sayHelloTo("Charles");
		sayHelloTo("Mary");
		
		int x = returnFive();
		System.out.println(x);
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
}
