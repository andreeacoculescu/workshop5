package foo;

public class StudentConsumer {
	public static void main(String [] args)
	{
		Student s1 = new Student(29,"Andrei");
		System.out.println("Hello student with name "+s1.getName());
	}
}
