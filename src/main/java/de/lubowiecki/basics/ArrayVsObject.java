package de.lubowiecki.basics;

public class ArrayVsObject {

    public static void main(String[] args) {

        // person (vorname, nachname, alter, raucher, lebendig)
        String[] p1 = {"Peter", "Parker", "17", "false", "true"};
        printPerson(p1);

        Person2 p2 = new Person2("Bruce", "Banner", 32, true, true);
        printPerson(p2);

        // IS-A
        // HAS-A

    }

    static void printPerson(String[] person) {
        System.out.println("Vorname: " + person[0]);
        System.out.println("Nachname: " + person[1]);
        System.out.println("Alter: " + person[2]);
        System.out.println("Raucher: " + person[3]);
        System.out.println("Lebendig: " + person[4]);
    }

    static void printPerson(Person2 person) {
        System.out.println("Vorname: " + person.getVorname());
        System.out.println("Nachname: " + person.getNachname());
        System.out.println("Alter: " + person.getAlter());
        System.out.println("Raucher: " + person.isRaucher());
        System.out.println("Lebendig: " + person.isLebendig());
    }
}

class Person2 {

    private String vorname;
    private String nachname;
    private int alter;
    private boolean raucher;
    private boolean lebendig;

    public Person2(String vorname, String nachname, int alter, boolean raucher, boolean lebendig) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.raucher = raucher;
        this.lebendig = lebendig;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public boolean isRaucher() {
        return raucher;
    }

    public void setRaucher(boolean raucher) {
        this.raucher = raucher;
    }

    public boolean isLebendig() {
        return lebendig;
    }

    public void setLebendig(boolean lebendig) {
        this.lebendig = lebendig;
    }
}