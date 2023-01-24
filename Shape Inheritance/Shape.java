class Shape
{
protected double length;
public Shape(double length){
this.length=length;
}
public void setLength(double length)
{
this.length=length;
}
double getLength(){
return length;}

public void area(){
System.out.println("the length is ="+length);
}

}
