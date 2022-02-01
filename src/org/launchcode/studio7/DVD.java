package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    public DVD(int storageCapacity, String name, String discType, double thickness) {
        super(storageCapacity, name, discType, thickness);
    }

    @Override
    public void readWavelength() {
        System.out.println("DVDs are read at a wavelength of 650nm.");

    }

    @Override
    public void writeData() {
        System.out.println("DVD is writing at 1385 kB/s.");
    }

    @Override
    public void spinDisc() {
        System.out.println("DVD spinning at 1500 RPM.");
    }

    @Override
    public void spinMax() {

    }
}