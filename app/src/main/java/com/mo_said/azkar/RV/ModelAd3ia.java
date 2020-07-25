package com.mo_said.azkar.RV;

public class ModelAd3ia {
    String title;
    String disc;


    public ModelAd3ia(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public ModelAd3ia(String title, String disc) {
        this.title = title;
        this.disc = disc;
    }

    public String getDisc() {
        return disc;
    }
}
