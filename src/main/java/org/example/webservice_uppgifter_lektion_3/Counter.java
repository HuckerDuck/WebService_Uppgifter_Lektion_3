package org.example.webservice_uppgifter_lektion_3;

public class Counter {
    private int id;
    private int value;

    public Counter(int id, int value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }
}
