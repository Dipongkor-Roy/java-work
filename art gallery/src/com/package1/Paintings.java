package com.package1;

import java.util.UUID;

public abstract class Paintings implements IGallery {
    private UUID paintingID;
    private  String name;
    private String description;
    private int price;
    private String painter;
    private String medium;

    public  Paintings(){}

    public Paintings(String name, String description, int price, String painter, String medium) {
        this.paintingID=UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.price = price;
        this.painter = painter;
        this.medium = medium;
    }

    public UUID getPaintingID() {
        return paintingID;
    }

    public void setPaintingID(UUID paintingID) {
        this.paintingID = paintingID;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPainter() {
        return painter;
    }

    public void setPainter(String painter) {
        this.painter = painter;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    @Override
    public String toString() {
        return "Paintings{" +
                "paintingID=" + paintingID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", painter='" + painter + '\'' +
                ", medium='" + medium + '\'' +
                '}';
    }

    public void paintingDetails() {
        setName("Over the meadow");
        setPainter(" Brussel Ellie ");
        setMedium("oil");
        setPrice(6700);
        setDescription("It's an artwork made in 1905 belonging to Swiss Artist. ");
        System.out.println("\nName of painting : "+ getName());
        System.out.println("Name of Painter : " + getPainter());
        System.out.println("Medium used : " + getMedium());
        System.out.println("price of art = $" + getPrice());
        System.out.println("Little information about 'Over the meadow : " + getDescription());

        setName("Rising Cat");
        setPainter(" Elloise Beige ");
        setMedium("oil");
        setPrice(7800);
        setDescription("It's an artwork made in mid 18s belonging to UK Artist. ");
        System.out.println("\nName of painting : "+ getName());
        System.out.println("Name of Painter : " + getPainter());
        System.out.println("Medium used : " + getMedium());
        System.out.println("price of art = $" + getPrice());
        System.out.println("Little information about 'Over the meadow : " + getDescription());


    }
}
