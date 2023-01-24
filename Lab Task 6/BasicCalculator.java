public abstract class BasicCalculator extends Calculation implements IScientificCalculator {
double value1;
double value2;

BasicCalculator (){
};
BasicCalculator (double value1,double value2){
	this.value1= value1;
    this.value2= value2;
	System.out.println("V1="+value1);
	System.out.println("V2="+value2);
}
public abstract void SetValue1(double value1);
public abstract void SetValue2 (double value2);
public abstract double  getValue1();
public abstract  double  getValue2();


}





