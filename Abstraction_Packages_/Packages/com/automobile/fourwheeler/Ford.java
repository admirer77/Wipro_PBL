package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {
    @Override
    public String getModelName() {
        return "Model name: Ford 100";
    }

    @Override
    public String getRegistrationNumber() {
        return "Reg.No: AP15R1258";
    }

    @Override
    public String getOwnerName() {
        return "Owner name: Kunden";
    }

    public int speed() {
        return 200;
    }

    public int tempControl() {
        return 1;
    }
}
