public abstract class Shape{
	double length;
	Shape(){ }
	Shape(double length){
		this.length=length;
	}
	abstract double area();
}
