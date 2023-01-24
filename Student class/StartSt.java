class StartSt{
public static void main(String [] args)
{
Student st= new Student("alam","1234", 3.5, "cs");
Student st2= new Student("rifat","1230", 3.7, "cs");

System.out.println(st.name);
System.out.println(st2.name);

st.print();
st2.print();
}

}