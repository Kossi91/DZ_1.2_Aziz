package com.company;

public class Citrus extends Fruit{

    private int size;

    public int getSize() {
        return size;
    }

    public Citrus(String name, Color color, Homeland homeland, int size) {
        super(name, color, homeland);
        this.size = size;
    }
    public Citrus(int size ,String name, Color color, Homeland homeland) {
        super(name, color, homeland);
        this.size = size;
    }

    public final void Citrus(int size) {
        this.size = size;
    }

    public String printInfo(){
        return super.printInfo() + " " + getSize();
    }
}


