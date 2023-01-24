import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Student students [ ]=new Student[7];
		
Student s1=new Student();
s1.setName("Dipu");
s1.setId("21-4xxxx-3");
s1.setDept("CSE");
s1.setCgpa(3.8);

Student s2=new Student();
s2.setName("Tanvir");
s2.setId("21-4xxxx-3");
s2.setDept("CSE");
s2.setCgpa(3.3);

Student s3=new Student();
s3.setName("Mahib");
s3.setId("21-4xxxx-3");
s3.setDept("CSE");
s3.setCgpa(2.5);

Student s4=new Student();
s4.setName("Rifat");
s4.setId("21-4xxxx-3");
s4.setDept("CSE");
s4.setCgpa(3.0);

        students[0] = s1;
		students[2] = s2;
		students[3] = s3;
		students[4] = s4;
		
		for(int i=0; i<students.length; i++)
		{
			if(students[i] != null)
			{
				System.out.println("------------------");
				System.out.println("students["+i+"] Name: "+students[i].getName());
				System.out.println("students["+i+"] Id: "+students[i].getId());
				System.out.println("students["+i+"] Cgpa: "+students[i].getCgpa());
				System.out.println("students["+i+"] Dept: "+students[i].getDept());
				System.out.println();
			}
			else
			{
				System.out.println("------------------");
				System.out.println("There is No Object in Students["+i+"]");
			}
		}
	}
}



		











