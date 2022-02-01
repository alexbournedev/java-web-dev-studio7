package org.launchcode.studio7;

public interface OpticalDisc {
    public static final double THICKNESS_IN_MM = 1.2;
    public static final double DIAMETER = 120;
    public static final int MAX_SPINS = 10;

//    default void test(){
//        double diameterSquared = DIAMETER * DIAMETER;
//    }

    void spinDisc();

    void spinMax();
}