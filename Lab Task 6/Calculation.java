public class Calculation {

double value1;
double value2;

Calculation(){
};

Calculation(double value1,double value2){
this.value1=value1;
this.value2=value2;
System.out.println("Value1:"+value1);
System.out.println("Value2:"+value2);
}
double add( ){
  double sum= value1+value2;
  System.out.println("Sum: "+ sum);
  return add();
  
}
double  substract(){
  double sub= value1-value2;
  System.out.println("Sub: "+ sub);
 return substract();

}
double multiply(){
  double multi= value1*value2;
  System.out.println("Multiply: "+ multi);
   return multiply();
  
}
 double  divide( ){
  double div= value1/value2;
  System.out.println("Divide: "+ div);
  return divide();
 
}

void CalculationInfo(){
System.out.println("Add :"+add());
System.out.println(" Subtract :"+substract());
System.out.println("Multiply :"+multiply());
System.out.println("Divide :"+divide());
}



}