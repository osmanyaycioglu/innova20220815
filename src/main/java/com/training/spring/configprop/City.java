package com.training.spring.configprop;

public class City {
    private String name;
    private int index;
    private String shortName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", index=" + index +
                ", shortName='" + shortName + '\'' +
                '}';
    }
}
