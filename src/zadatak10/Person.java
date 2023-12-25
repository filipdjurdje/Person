package zadatak10;

public class Person {
	public class MyClass {
		public static void main(String[]Args) {
			Person j;
			j = new Person();
			j.setAge(20);
			celebrateBirthday(j);
			System.out.println(j.getAge());
		}
		static void celebrateBirthday(Person p) {
			p.setAge(p.getAge()+1);
		}

	}

	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setAge(int i) {
		// TODO Auto-generated method stub
		
	}
}
