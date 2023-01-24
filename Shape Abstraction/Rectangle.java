public class Rectangle extends Shape
{
protected  double height;
public Rectangle(double length,double height){
super(length);
this.height=height;
}
public void setHeight(double height)
{
this.height=height;
}
double getHeight(){
return height;}

public double area(){
double area = length*height;
System.out.println("the area of rectangle= "+area);
return area;
}


}

