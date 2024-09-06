package de.lubowiecki.basics.interfaces;

public abstract class AbstractDocument { // abstrakte Klassen sind nicht instanzierbar

    private int size;

    public AbstractDocument(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
