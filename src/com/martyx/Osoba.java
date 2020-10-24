package com.martyx;



@TargetAnotation
public class Osoba implements @TargetAnotation Comparable<@TargetAnotation Osoba>{
    private @TargetAnotation String meno;
    private String priezvisko;
    private int vek;

    @TargetAnotation
    public Osoba(String meno, String priezvisko, int vek) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.vek = vek;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    @Override
    public int compareTo(Osoba o) {
        return 0;
    }
}
