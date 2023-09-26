package mk224ib_assign3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class moonsMain {
    public static void main(String[] args) {
        planet mars=new planet("Mars",4,2,1.666,1.382);

        moon a=new moon("Phobos",12);
        moon b=new moon("Deimos",12);
        ArrayList<moon> li=new ArrayList<moon>();
        li.add(0,a);
        li.add(1,b);
        mars.addMoons(li);
        System.out.println("Moons of "+mars.getName()+":");
        System.out.println("\t"+mars.getMoons()[0].getName()+"\n"+"\t"+mars.getMoons()[1].getName());

    }
}
