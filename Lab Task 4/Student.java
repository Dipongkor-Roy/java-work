import java.lang.*;

public class Student{

private String name;
private String id;
private String dept; 
private double cgpa;

public void setName(String l)
	{
		name = l;
	}
	public void setId(String k)
	{
		id = k;
	}
	public void setDept(String m)
	{
		dept = m;
	}
	public void setCgpa(double v)
	{
		cgpa = v;
	}
	
    public String getName(){return name;}
	public String getId(){return id;}
	public String getDept(){return dept;}	
	public double getCgpa(){return cgpa;}	
	
}