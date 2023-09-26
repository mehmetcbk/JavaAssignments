package mk224ib_assign3;

import java.util.ArrayList;

public class StonePlanets {
    public static void main(String[] args) {
        planet mercury=new planet("Mercury",1,0,0.47,0.31);
        planet venus=new planet("Venus",2,0,0.72,0.72);
        planet earth=new planet("Earth",3,1,1,0.99);
        planet mars=new planet("Mars",4,2,1.666,1.382);
        moon theMoon=new moon("The Moon",1);
        moon phobos=new moon("Phobos",1);
        moon deimos=new moon("Deimos",1);
        ArrayList<moon> earthMoons=new ArrayList<moon>();
        earthMoons.add(0,theMoon);
        ArrayList<moon> marsMoons=new ArrayList<moon>();
        marsMoons.add(0,phobos);
        marsMoons.add(1,deimos);
        mars.addMoons(marsMoons);
        earth.addMoons(earthMoons);
        //System.out.println(mars.getMoons()[0].getName());
        planet[] plan=new planet[4];
        plan[0]=mercury;
        plan[1]=venus;
        plan[2]=earth;
        plan[3]=mars;
        for (int i = 0; i <4 ; i++) {
            System.out.println("Planet "+plan[i].getName()+" has aphelion "+plan[i].getAphelion()+" AU, perihelion "+plan[i].getPerihelion()+" AU and "+plan[i].getNoOfMoons()+" moons.");
            if (plan[i].getNoOfMoons()>0){
                for (int j = 0; j < plan[i].getNoOfMoons(); j++) {
                    System.out.println("\t"+plan[i].getMoons()[j].getName());
                }
            }

        }
        }
    }

