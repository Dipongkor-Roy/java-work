public class Start
{
public static void main(String[]args)
{
Box b1=new Box();
b1.setlength(3.1416);
b1.setwidth(1.45);
b1.setheight(3.00);

System.out.println("First one");
System.out.println("length="+b1.getlength());
System.out.println("width="+b1.getwidth());
System.out.println("height="+b1.getheight());

Box b2=new Box();
b2.setlength(2.89);
b2.setwidth(1.76);
b2.setheight(2.07);

System.out.println("\n");
System.out.println("Second one");
System.out.println("length="+b2.getlength());
System.out.println("width="+b2.getwidth());
System.out.println("height="+b2.getheight());
}
}