package de.lubowiecki.basics;

public class Robot {

    private String name;

    private int x;

    private int y;

    public Robot() {
    }

    public Robot(String name) {
        this.name = name;
    }

    public Robot(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void schrittVor() {
        //x += 1;
        x++;
    }

    public void schrittZurueck() {
        x--;
    }

    public void schrittHoch() {
        y++;
    }

    public void schrittUnter() {
        y--;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
