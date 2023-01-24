import java.util.Scanner;
public class Strings {
 public static void main(String[] args) {
 	Scanner sc= new Scanner(System.in);
 	System.out.println("Enter String 1");
    String str1=sc.nextLine();
    System.out.println("Enter String 2");
    String str2=sc.nextLine();
    int lengthstr1=str1.length();
    System.out.println("Length of Str1: "+"   "+lengthstr1);
    String str3= str2.substring(2,4);
    System.out.println(str3);
    System.out.println("String 2 Index Of 2 : "+ str2.charAt(2));
    
    if(str1==str2)
        {System.out.println("String 1 and String 2 are equal");}
        else
        System.out.println("String 1 and String 2 are not equal");

}
}
