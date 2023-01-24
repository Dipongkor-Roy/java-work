public class Circle extends Shape
{
public Circle(double length){

	super(length);
}
public double area(){

double area = length*length*3.1416;
System.out.println("the area of circle= "+area);
return area;
}

}