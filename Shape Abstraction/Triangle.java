public class Triangle extends Shape
{
protected double base;
public Triangle(double length, double base)
{
super(length);
this.base=base;

}
public void setBase(double base)
{
this.base=base;
}
double getBase(){
return base;
}
public double area(){
double area= length*.5*base;
System.out.println("the area of Triangle= "+area);
return area;
}


}
