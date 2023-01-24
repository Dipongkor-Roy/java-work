 public class Calculator {
    int sum;
    int sub;
    double div;
    int multi;

    void addition(int a,int b){
        sum= a+b;
        System.out.println("Sum :"+sum);
    }
    void subtraction(int a,int b){
        sub= a-b;
        System.out.println("Subtraction :"+sub);
    }
    void division(double a,double b){
        div= a/b;
        System.out.println("Division :"+div);
    }
    void multi(int a,int b){
        multi= a*b;
        System.out.println("Multi :"+multi);
    }

}
