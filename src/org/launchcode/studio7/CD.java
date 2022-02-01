package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(int storageCapacity, String name, String discType, double thickness) {
        super(storageCapacity, name, discType, thickness);
    }

    @Override
    public void readWavelength() {
        System.out.println("CDs are read at a wavelength of 780nm.");

    }

    @Override
    public void writeData() {
        System.out.println("CD is writing at 153.6 kB/s");

    }

    @Override
    public void spinDisc() {
        System.out.println("CD spinning at 500 RPM.");

    }

    @Override
    public void spinMax() {

    }
}