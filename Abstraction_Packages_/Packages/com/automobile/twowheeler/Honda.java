package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {

    @Override
    public String getModelName() {
        return "Model name: Honda 100";
    }

    @Override
    public String getRegistrationNumber() {
        return "Reg.No: TS15R8523";
    }

    @Override
    public String getOwnerName() {
        return "Owner name: Manush";
    }

    public int getSpeed() {
        System.out.println("Speed = 120 kmph");
        return 120;
    }

    public void cdplayer() {
        System.out.println("CD");
    }
}
