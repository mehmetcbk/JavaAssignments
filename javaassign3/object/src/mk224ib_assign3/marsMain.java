package mk224ib_assign3;

import java.util.Scanner;

public class marsMain {
    public static void main(String[] args) {
        planet mars=new planet("Mars",4,2,1.666,1.382);
        System.out.println(mars.getName()+":");
        System.out.println("\t"+"possition: "+mars.getPossitionFromSun());
        System.out.println("\t"+"moons: "+mars.getNoOfMoons());
        System.out.println("\t"+"aphelion: "+mars.getAphelion());
        System.out.println("\t"+"perihelion: "+mars.getPerihelion());

    }
}
