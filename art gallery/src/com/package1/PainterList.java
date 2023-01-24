package com.package1;

import java.util.*;


public class PainterList {
    ArrayList<Painter> painterArrayList = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void addPainter(){
Painter painter = new Painter();
        painter.setPainterID(UUID.randomUUID());
        System.out.println("enter artist name = " );
        painter.setName(input.nextLine());
        System.out.println("enter date of birth = ");
        painter.setDob(input.nextLine());
        System.out.println("write your details = ");
        painter.setAbout(input.nextLine());
        System.out.println("what is your gender = ");
        String gender = input.nextLine();

  if (gender.toLowerCase().equals("male")){
      painter.setGender(Gender.MALE);
  }else if(gender.toLowerCase().equals("female")){
      painter.setGender(Gender.FEMALE);
  }else {
      painter.setGender(Gender.NON_BINARY);
  }

        painterArrayList.add(painter);
    }

    public void displayPainterDets(){
        for (Painter painter : painterArrayList){
            System.out.println("painter name= "+ painter.getName());
            System.out.println("painter's date of birth=" + painter.getDob());
            System.out.println("about painter= " + painter.getAbout());
            System.out.println("gender of painter= " + painter.getGender()+"\n");
            //      System.out.println("painter details = " + painter.toString());

        }
    }
}
