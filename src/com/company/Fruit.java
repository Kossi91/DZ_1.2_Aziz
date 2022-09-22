package com.company;

public abstract class Fruit {
    private String name;
    private Color color;
    private Homeland homeland;

    public Fruit(String name, Color color, Homeland homeland) {

        this.name = name;
        this.color = color;
        this.homeland = homeland;
    }


    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public Homeland getHomeland() {
        return homeland;
    }
    public String printInfo(){
        return (getName() + " " + getColor() + " " + getHomeland().getMesto());
    }

}