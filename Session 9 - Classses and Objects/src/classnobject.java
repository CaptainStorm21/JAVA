

public class classnobject {
	public static void main(String[] args) {
		//getters and setters

		Person john = new Person("John Cane");
		john.setAge(23);
		john.year = 1900;
		
		Person amy = new Person("Amy Caven");
		amy.setAge(13);
		amy.year = 1994;
		
		john.sayHelloTo(amy);
		amy.sayHelloTo(john);
		
		
		//john.getName()
		System.out.println(john.getName() + " is " + john.age);
		System.out.println(amy.getName() + " is " + amy.age);
		System.out.println(amy.getName() + " was born " + amy.year);
		System.out.println(john.getName() + " was born " + john.year);
	}
}
