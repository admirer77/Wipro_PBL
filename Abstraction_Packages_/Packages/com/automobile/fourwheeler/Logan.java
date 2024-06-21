package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle{
    @Override
    public String getModelName() {
        return "Model name: Logan 100";
    }

    @Override
    public String getRegistrationNumber() {
        return "Reg.No: AP15R8523";
    }

    @Override
    public String getOwnerName() {
        return "Owner name: Nikhil";
    }

    public int speed() {
        return 180;
    }

    public int gps() {
        return 1;
    }
}
