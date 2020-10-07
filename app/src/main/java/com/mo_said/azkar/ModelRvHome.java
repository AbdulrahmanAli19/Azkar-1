package com.mo_said.azkar;

public class ModelRvHome {
    private int Image;
    private String Text;


    public ModelRvHome(int image, String text) {
        Image = image;
        Text = text;
    }

    public int getImage() {
        return Image;
    }

    public String getText() {
        return Text;
    }
}
