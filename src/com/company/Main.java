package com.company;

public class Main {
    public static void main(String[] args) {

      Homeland homeland = new Homeland("Турецкий ");
      Homeland homeland1 = new Homeland("Ташкенский ");
      Citrus citrus = new Citrus("Киви ", Color.GREEN, homeland,5);
      Lemon lemon = new Lemon("Лимон ", Color.YELLOW, homeland1, 3, 120);
      Lemon lemon1 = new Lemon("Апельсин ", Color.RED, homeland,6,150 );


        System.out.println(citrus.printInfo());
        System.out.println(lemon.printInfo());
        System.out.println(lemon1.printInfo());

    }
}
