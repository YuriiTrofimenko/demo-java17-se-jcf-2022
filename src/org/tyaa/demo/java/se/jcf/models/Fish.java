package org.tyaa.demo.java.se.jcf.models;

public class Fish {

    private String name;
    private double weight;
    private double price;

    public Fish(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Fish)) {
            return false;
        }
        Fish tmp = (Fish) o;
        return (tmp.name.equals(this.name) &&
            tmp.weight == this.weight &&
            tmp.price == (this.price));
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public double getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.name + " weight:" + this.weight +
            "price:" + this.price;
    }
}
