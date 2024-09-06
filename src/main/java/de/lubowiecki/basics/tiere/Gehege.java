package de.lubowiecki.basics.tiere;

import java.util.ArrayList;
import java.util.List;

public class Gehege {

    private List<Sozialisiert> bewohner = new ArrayList<>();

    public void aufnehmen(Sozialisiert element) {
        bewohner.add(element);
    }

    public void starteFuetterung() {
        for(Sozialisiert s : bewohner) {
            s.fressen();
        }
    }
}
