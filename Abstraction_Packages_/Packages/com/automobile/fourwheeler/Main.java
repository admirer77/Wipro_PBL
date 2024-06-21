package com.automobile.fourwheeler;

public class Main {
    public static void main(String[] args) {

        Logan loganCar = new Logan();
        System.out.println(loganCar.getModelName());
        System.out.println(loganCar.getRegistrationNumber());
        System.out.println(loganCar.getOwnerName());
        System.out.println("Logan Speed: " + loganCar.speed());
        System.out.println("Logan GPS: " + (loganCar.gps() == 1 ? "Enabled" : "Disabled"));

        Ford fordCar = new Ford();
        System.out.println(fordCar.getModelName());
        System.out.println(fordCar.getRegistrationNumber());
        System.out.println(fordCar.getOwnerName());
        System.out.println("Ford Speed: " + fordCar.speed());
        System.out.println("Ford AC: " + (fordCar.tempControl() == 1 ? "On" : "Off"));
    }
}   

