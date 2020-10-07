package com.mo_said.azkar.RV;

public class Model {
    String title;
    String disc;
    String color;
    boolean expanded;


    public Model(String title) {
        this.title = title;
    }

    public Model(String title, String disc) {
        this.title = title;
        this.disc = disc;
    }

    public Model(String title, String color, String disc) {
        this.title = title;
        this.color = color;
        this.disc = disc;
        this.expanded = false;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    public String getTitle() {
        return title;
    }


    public String getDisc() {
        return disc;
    }

    public String getColor() {
        return color;
    }
}
