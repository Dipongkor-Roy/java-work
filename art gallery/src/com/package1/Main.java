package com.package1;

import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IGallery.galleryAddress();

        PainterList painterList = new PainterList();
        System.out.println("sign in as painter : ");
        painterList.addPainter();
        painterList.displayPainterDets();

        try{
            File file =  new File("gallery info.txt" );
            if (file.createNewFile()){
                System.out.println("file successfully created. All guest info exists in :  " + file.getName());
            }
            else {
                System.out.println("already exists. Please make new file.");
            }
            FileWriter writing = new FileWriter(file,true);
            writing.write("this is a new database of guests." +
                    "\nThe people are present from all over the world.\n ");
            writing.flush();
            writing.close();
            System.out.println("\n successfully written list. " );


            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()){
                String basicData = myReader.nextLine();
                System.out.println(basicData);
            }
            myReader.close();
        }
        catch (IOException e){
            System.out.println("unexpected error.");
            e.printStackTrace();
        }


        System.out.println( " \n painter got access to customer details = ");
        System.out.println();
        Guests g1 = new Guests();
        g1.addGuests();

        Paintings paintingRef = new Painter();
        paintingRef.paintingDetails();

    }
}
