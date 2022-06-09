package com.company;

public class Car {
    private int id;
    private int nomer;

    public Car(int id, int nomer) {
        this.id = id;
        this.nomer = nomer;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    @Override
    public String toString() {
        return "\n-----------Car----------" +
                "\nid: " + id +
                "\nnomer: " + nomer;
    }
}