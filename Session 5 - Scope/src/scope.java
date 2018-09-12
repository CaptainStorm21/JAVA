
public class scope {
	
	static int x;
	
	public static void main(String[] args) {
		x = 100;
		System.out.println(x);
		
		doSomething();
		System.out.println(x);
		
		doItLocally();
		
	}
	
	static void doSomething() {
		x = 2000;
	}
	
	static void doItLocally() {
		int y = 899;
		System.out.println("this is local int " + y);
	}
}

