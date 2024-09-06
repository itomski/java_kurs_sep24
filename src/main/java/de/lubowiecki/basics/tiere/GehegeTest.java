package de.lubowiecki.basics.tiere;

public class GehegeTest {

    public static void main(String[] args) {

        Gehege gehege = new Gehege();
        gehege.aufnehmen(new Affe());
        gehege.aufnehmen(new Tiger());
        //gehege.aufnehmen(new Tier());

        gehege.starteFuetterung();


    }

}
