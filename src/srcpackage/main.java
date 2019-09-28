package srcpackage;

import person.Person;

public class main {

	public static void main(String[] args) {

		//SimpleSet<Integer> error1 = new SimpleSet<>(1, 2, 2, 3, 4); //This line
		// should cause an exception.
		// SimpleSet<Integer> error2 = new SimpleSet<>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
		// 11);

		// Testing Constructors
		SimpleSet<String> strings = new SimpleSet<>("java", "python", "c++", "c#", "ada", "kotlin", "swift");
		SimpleSet<Person> people = new SimpleSet<>(new Person("John", "Smith"), new Person("Amanda", "Richardson"),
				new Person("Bob", "Green"), new Person("Sue", "Smith"), new Person("Fred", "Parsons"),
				new Person("Jane", "Doe"));
		SimpleSet<Integer> nums = new SimpleSet<>(4, 7, 100, 23, 67, 87, 2013, 59, 29, 40);
		SimpleSet<Character> chars = new SimpleSet<>();

		// Testing toString();
		System.out.println("Testing toString():");
		System.out.println(strings);
		System.out.println(people);
		System.out.println(nums);
		System.out.println(chars);
		System.out.println();
		System.out.println();

		// Testing add
		System.out.println("Testing add():");
		// strings.add("java"); //This line should fail.
		// people.add(new Person("John", "Smith")); //This line should fail.
		// nums.add(42)// This line should fail.

		strings.add("fortran");
		people.add(new Person("Kate", "Walker"));
		chars.add('q');

		System.out.println(strings);
		System.out.println(people);
		System.out.println(nums);
		System.out.println(chars);
		System.out.println();
		System.out.println();

		// Testing contains
		System.out.println("Testing contains():");
		System.out.println(strings.contains("java"));
		System.out.println(strings.contains("sql"));
		System.out.println(people.contains(new Person("Bob", "Green")));
		System.out.println(people.contains(new Person("Jimmy", "Reed")));
		System.out.println(nums.contains(2013));
		System.out.println(nums.contains(1000));
		System.out.println(chars.contains('q'));
		System.out.println(chars.contains('i'));
		System.out.println();
		System.out.println();

		// Testing get()
		System.out.println("Testing get():");
		// System.out.println(chars.get(6)); //This line should fail.
		// System.out.println(people.get(9)); //This line should fail.
		System.out.println(strings.get(3));
		System.out.println(people.get(4));
		System.out.println(nums.get(6));
		System.out.println(chars.get(0));
		System.out.println();
		System.out.println();

		// Testing put():
		System.out.println("Testing put():");
		// strings.put(3, "java"); //This line should fail.
		// people.put(5, new Person("Sue", "Smith")); //This line should fail.
		// nums.put(10, 57); //This line should fail.
		// chars.put(2, 'c'); //This line should fail.
		strings.put(3, "objective-c");
		people.put(0, new Person("John", "Smith")); // This line should be ok.
		people.put(1, new Person("Jill", "Peters"));
		nums.put(6, 10000);

		chars.put(0, 'e');
		System.out.println(strings);
		System.out.println(people);
		System.out.println(nums);
		System.out.println(chars);
		System.out.println();
		System.out.println();

		// Testing size():
		System.out.println(strings.size());
		System.out.println(people.size());
		System.out.println(nums.size());
		System.out.println(chars.size());
		System.out.println();
		System.out.println();

		// Testing sort():
		Sorting.sort(strings);
		Sorting.sort(people);
		Sorting.sort(nums);
		Sorting.sort(chars);
		System.out.println(strings);
		System.out.println(people);
		System.out.println(nums);
		System.out.println(chars);
		System.out.println();
		System.out.println();

	}
}
