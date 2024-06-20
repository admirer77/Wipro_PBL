package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {

    @Override
    public String getModelName() {
        return "Model name: Hero 100";
    }

    @Override
    public String getRegistrationNumber() {
        return "Reg.No: TS15R1234";
    }

    @Override
    public String getOwnerName() {
        return "Owner name: Nihish";
    }

    public int getSpeed() {
        System.out.println("Speed = 110 kmph");
    }

    public void radio() {
        System.out.println("Radio Mirchi");
    }
}
