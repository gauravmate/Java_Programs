package javaiostreamprograms;

import java.io.Serializable;

public class student implements Serializable {
    private int id;
    private String name;

    public student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
