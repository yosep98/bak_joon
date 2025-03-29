import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int age=sc.nextInt();
			String name =sc.next();
			Person person = new Person(name,age);
			list.add(person);
		}
		list.sort(new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2){
				return Integer.compare(p1.age,p2.age);
			}
		});

		for(Person person:list){
			System.out.println(person);
		}





	}

	public static class Person {
		String name;
		int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
		@Override
		public String toString() {
			return age + " " + name;
		}

	}

}
