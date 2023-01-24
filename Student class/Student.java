class Student{

public String name;
public String id;
public double cgpa;
public String dept;

Student( )
{

}

Student(String n, String id, double cgpa, String dept)
{
this.name=n;
this.id= id;
this.cgpa=cgpa;
this.dept = dept;
}

public void print()
{
System.out.println("student name: " +name);
System.out.println("Student id: " + id);

System.out.println("Student CGPA: " + cgpa);

System.out.println("Student Dept:" +dept);

}

}