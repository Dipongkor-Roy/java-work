package com.package1;

import java.util.UUID;

public class Painter extends Paintings {
    private UUID painterID;
    private String name;
    private String dob;
    private String about;
    private Gender gender;

    public Painter(){}

    public Painter(String name, String dob, String about, Gender gender) {
        this.painterID = UUID.randomUUID();
        this.name = name;
        this.dob = dob;
        this.about = about;
        this.gender= gender;
    }

    public UUID getPainterID() {
        return painterID;
    }

    public void setPainterID(UUID painterID) {
        this.painterID = painterID;
    }

    public  String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Painter{" +
                "painterID=" + painterID +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", about='" + about + '\'' +
                ", gender=" + gender +
                '}';
    }
}
