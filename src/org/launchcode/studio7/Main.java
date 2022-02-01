package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        var cd = new CD(700, "Final Fantasy 7", "CD-ROM", 1.2);

        var dvd = new DVD(8000, "Halo 3", "DVD-ROM", 1.2);

        var vinyl = new Vinyl(340, "Let It Be", "Vinyl LP", 0.6);

        cd.spinDisc();
        dvd.spinDisc();
        cd.readWavelength();
        dvd.readWavelength();
        cd.writeData();
        dvd.writeData();


        System.out.println(vinyl.getName() + " is spinning at 45 RPM");

    }
}