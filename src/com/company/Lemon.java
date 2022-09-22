package com.company;

public class Lemon extends Citrus{

   private int price;

    public int getPrice() {
        return price;
    }

    public Lemon(String name, Color color, Homeland homeland, int size, int price) {
        super(name, color, homeland, size);
        this.price = price;
    }

    public String printInfo(){
        return super.printInfo() + " " + getPrice();
    }
}


