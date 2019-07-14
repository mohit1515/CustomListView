package com.example.mohit.customlistview;

public class SingleRowClass {
    private String name,designation;
    private int images;

    public SingleRowClass(String name, String designation, int images) {
        this.name = name;
        this.designation = designation;
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public int getImages() {
        return images;
    }
}
