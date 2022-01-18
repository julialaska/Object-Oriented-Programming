package lab11;

import java.util.PriorityQueue;

class Zadanie implements Comparable<Zadanie>{

    public Zadanie(String opis, int priorytet){
        this.opis = opis;
        this.priorytet = priorytet;
    }

    public int getPriorytet() {
        return priorytet;
    }

    public void setPriorytet(int priorytet) {
        this.priorytet = priorytet;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    private int priorytet;
    private String opis;

    @Override
    public int compareTo(Zadanie o) {
        if(this.priorytet == o.getPriorytet())
            return 0;
        else if(this.priorytet > o.getPriorytet())
            return 1;
        else
            return 0;
    }
}