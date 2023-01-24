import java.io.*;
import java.util.Scanner;

class fileCreate{
public static void main(String[] args){
try{
File file=new File("java.txt");
if(file.createNewFile()){
System.out.println("File Created"+file.getName());
}else{
System.out.println("File Already Exist");
}
FileWriter mw=new FileWriter(file,true);
mw.write("This is my code");
mw.flush();
mw.close();
System.out.println("Successfully wrote to the file");

Scanner myReader= new Scanner(file);
while (myReader.hasNextLine()){
	String data=myReader.nextLine();
	System.out.println(data);
}
}
catch(Exception a){
System.out.println("An Error Occured");
a.printStackTrace();
}


}


}