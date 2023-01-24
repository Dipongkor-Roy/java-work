class Start
{
public static void main(String[]args)
{
Student ob1=new Student();

ob1.Show_info();
ob1.name="Dipu";
ob1.id="156";
ob1.dept="CSE";
ob1.cgpa=3.8;
ob1.Show_info();
Student.totalCompletedCourses= 10;
ob1.Show_info();

Student ob2=new Student();

ob1.Show_info();
ob2.name="Rifat";
ob2.id="150";
ob2.dept="CSE";
ob2.cgpa=2.9;
ob2.Show_info();

Student.totalCompletedCourses= 12;
ob1.Show_info();
ob2.Show_info();



}

}
