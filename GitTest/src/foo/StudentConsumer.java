package foo;

public class StudentConsumer {
	public static void main(String [] args)
	{
		Student s1 = new Student(29,"Andrei");
		System.out.println("Hello student with name "+s1.getName());
		StudentConsumer.displayAge(s1);
	}
	
	public static void displayAge(Student s)
	{
		long age = s.getAge();
		System.out.println(age);
	}
}