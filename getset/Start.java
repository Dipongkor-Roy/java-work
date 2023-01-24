public class Start
{

	public static void main(String args[])
	{
		Student st1= new Student();
		
		Student st2= new Student();
		
		st1.print_info();
		st2.print_info();

		
		
		st1.setName("Kalam");
		st1.setID("1234");
		st1.cgpa=3.75;
		st1.dept="CS";
		System.out.println("Name: "+st1.getName());

		st2.setName("Karim");
		st2.setID("1256");
		st2.cgpa=3.85;
		st2.dept="CS";

		

		System.out.println();
		st1.print_info();
		
		System.out.println();

		st2.print_info();
		
		Student	st3 = new Student("amina", "1267", 3.8, "cs");
		st3. print_info();
		st3.setName("Kalimuddin");
		st3. print_info();
		


	}

}