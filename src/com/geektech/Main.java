package com.geektech;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Shelter romashka = new Shelter("Romashka", "Ibraimova 90");

        Dog sharik = new Dog(romashka);
        Dog layka = new Dog("Layka ", "Чихуахуа", Color.BLACK, romashka);
        Dog barsik = new Dog("Barsik ", "Домашняя ", Color.BROWN, romashka,
                new String[]{"Стоять", "Сидеть"});

        System.out.println(sharik.getInfo());
        System.out.println("-------------------------");
        System.out.println(barsik.getInfo());
        System.out.println("-------------------------");
        System.out.println(layka.getInfo());
        System.out.println("-------------------------");

        barsik.makeVoice("Гав гав", 3);
        layka.makeVoice(2, "Рррр!");
        barsik.makeVoice("Гав! Рррр! Гав!");

    }
}
