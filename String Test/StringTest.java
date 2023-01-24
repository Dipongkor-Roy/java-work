import java.lang.String;
class StringTest
{
    public static void main(String[] args) {
        String s1="section c";
        String s2="java";
        String s3= new String("java");
        String s4= new String("section c");
        String s5=s2.concat(s4);
        String s6= s4.substring(3,7);
        String s7=s1;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        System.out.println(s5);
        System.out.println(s6);

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        

        if(s1==s7)
        {System.out.println("s1 and s7 are equal");}
        else
        System.out.println("not equal");
    }
}
