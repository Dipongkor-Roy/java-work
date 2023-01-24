package com.package1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Guests {
    private String gname;
    SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
    Date date1 = new Date();
  //  private   int boughtArt;
    Scanner input = new Scanner(System.in);
    ArrayList<String> guestList = new ArrayList<String>();


    public Guests(){}
    public Guests(String gname, SimpleDateFormat date) {
        this.gname = gname;
        this.date = date;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname ;
    }

    public SimpleDateFormat getDate() {
        return date;
    }

    public void setTime(SimpleDateFormat time) {
        this.date = date;
    }



    public void addGuests(){
        System.out.println(" guest names : ");
        guestList.add("Alfa");
        guestList.add("Silvie");
        guestList.add("blu");
        guestList.add("Marie");
        System.out.println(guestList);
        System.out.println("\n Date of arrival : ");

        System.out.println(date.format(date1));


    }

}
