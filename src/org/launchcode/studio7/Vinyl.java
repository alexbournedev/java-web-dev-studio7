package org.launchcode.studio7;

public class Vinyl extends BaseDisc implements OpticalDisc {

    public Vinyl(int storageCapacity, String name, String discType, double thickness) {
        super(storageCapacity, name, discType, thickness);
    }

    @Override
    public void spinDisc() {
        System.out.println("Spinning at 45rpm.");
    }

    @Override
    public void spinMax() {

    }

    @Override
    public void readWavelength() {

    }

    @Override
    public void writeData() {

    }
}