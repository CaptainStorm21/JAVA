
public class ReferenceAndValueTypes {
	public static void main(String[] args) {
		//value type: byte, short, int, long, float, double, boolean, char
		int x = 5;
		addOneTo(x);
		
		System.out.println(x);
		
		Person john;
		john = new Person("John Sylver");
		john.setAge(90);
		celebrateBirthday(john);
		System.out.println(john.getAge());
	}

	private static void celebrateBirthday(Person john) {
		john.setAge(john.getAge() + 1);
		
	}

	static void addOneTo(int number) {
		// TODO Auto-generated method stub
		number = number + 1;

	}
	
	
}
