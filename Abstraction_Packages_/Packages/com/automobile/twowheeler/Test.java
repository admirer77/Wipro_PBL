package com.automobile.twowheeler;

public class Test {
    public static void main(String[] args) {
        Honda honda = new Honda();
        Hero hero = new Hero();

        System.out.println(honda.getModelName());
        System.out.println(honda.getRegistrationNumber());
        System.out.println(honda.getOwnerName());
        honda.getSpeed();
        honda.cdplayer();

        System.out.println(hero.getModelName());
        System.out.println(hero.getRegistrationNumber());
        System.out.println(hero.getOwnerName());
        hero.getSpeed();
        hero.radio();
    }
}
