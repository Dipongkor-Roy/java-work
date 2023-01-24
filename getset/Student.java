public class Student
{
	private String name;
	private String id;
	public double cgpa;
	public String dept;
	

	public Student()
	{
		
	}

	public Student(String n, String id, double cgpa,String dept)
	{
		name=n;
		this.id= id;
		this.cgpa=cgpa;
		this.dept=dept;
	}

	
	public String getName()
	{
		return name;	
	}

	public String getID()
	{
		return id;	
	}

	public void setName(String x)
	{
		name=x;	
	}

	public void setID(String y)
	{
		id=y;	
	}




	public void print_info()
	{
		System.out.println("Student name: " +name);
		System.out.println("Student id: " +id);
		System.out.println("Student cgpa: "+cgpa);
		System.out.println("Student current Dept: "+dept);
		
	}


	


	
}