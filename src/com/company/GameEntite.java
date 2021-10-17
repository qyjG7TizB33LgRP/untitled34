package com.company;

public class GameEntite {
    private String color;
    private String views;
    private int breed;

    public GameEntite(){

    }

    public GameEntite(String color, String views, int breed) {
        this.color = color;
        this.views = views;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public int getBreed() {
        return breed;
    }

    public void setBreed(int breed) {
        this.breed = breed;
    }
}

