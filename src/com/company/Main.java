package com.company;

public class Main {
    public static void main(String[] args) {

      Homeland homeland = new Homeland("�������� ");
      Homeland homeland1 = new Homeland("���������� ");
      Citrus citrus = new Citrus("���� ", Color.GREEN, homeland,5);
      Lemon lemon = new Lemon("����� ", Color.YELLOW, homeland1, 3, 120);
      Lemon lemon1 = new Lemon("�������� ", Color.RED, homeland,6,150 );


        System.out.println(citrus.printInfo());
        System.out.println(lemon.printInfo());
        System.out.println(lemon1.printInfo());

    }
}
