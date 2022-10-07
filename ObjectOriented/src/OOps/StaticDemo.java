package OOps;

//Driver class
public class StaticDemo extends Student1{
	

	public StaticDemo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		// calling static method
		// without instantiating Student class
		Student1.setCllg("XYZ");

		Student1 s1 = new Student1("Alice");
		Student1 s2 = new Student1("Bob");

		s1.getStudentInfo();
		s2.getStudentInfo();

	}
}
