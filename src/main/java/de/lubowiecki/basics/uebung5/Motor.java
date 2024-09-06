package de.lubowiecki.basics.uebung5;

import java.util.Objects;

public class Motor {

    private int leistungInKw;

    private String art;

    public Motor(int leistungInKw, String art) {
        this.leistungInKw = leistungInKw;
        this.art = art;
    }

    public int getLeistungInKw() {
        return leistungInKw;
    }

    public void setLeistungInKw(int leistungInKw) {
        this.leistungInKw = leistungInKw;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Motor{");
        sb.append("leistungInKw=").append(leistungInKw);
        sb.append(", art='").append(art).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motor motor = (Motor) o;
        return leistungInKw == motor.leistungInKw && Objects.equals(art, motor.art);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leistungInKw, art);
    }
}
