import java.util.Scanner;
public class Start {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        Calculator cl= new Calculator();
        cl.addition(a,b);
        cl.subtraction(a,b);
        cl.multi(a,b);
        cl.division(a,b);
        
    }
}
