package mk224ib_assign3;

import java.util.ArrayList;

public class planet {
    private String name;
    private int possitionFromSun;
    private int noOfMoons;
    private double aphelion;
    private double perihelion;

    private ArrayList<moon> moons=new ArrayList<moon>(); //Part 3.3

    public planet(String nam,int posFromSun,int noOfMoon,double numaphelion,double numperihelion){
        this.name=nam;
        this.possitionFromSun=posFromSun;
        this.noOfMoons=noOfMoon;
        this.aphelion=numaphelion;
        this.perihelion=numperihelion;

    }
    //---------------------------------------------- Part 3.3


    public moon[] getMoons() {
        return moons.toArray(new moon[moons.size()]);
    }

   public void addMoons(ArrayList<moon> moons) {

        this.moons = moons;
    }
    //------------------------------------------------

    public String getName() {
        if (name.equals("")){
            return "Unknown planet";
        }
        return name;
    }

    public void setName(String name1) {
        if (name1.equals("")){
            this.name="Unknown planet";
        }else {
            this.name = name1;
        }
        }

    public int getPossitionFromSun() {
        if (possitionFromSun>1&&possitionFromSun<9){
            return possitionFromSun;
        }else{
        return possitionFromSun=0;
        }
    }

    public void setPossitionFromSun(int possitionFromSun1) {
        if (possitionFromSun1>1&&possitionFromSun1<9){
        this.possitionFromSun = possitionFromSun1;
        }else {
            this.possitionFromSun=0;
        }
    }

    public int getNoOfMoons() {
        if (this.noOfMoons>0&&this.noOfMoons<100){
            return noOfMoons;
        }else{
        return noOfMoons=0;
        }
    }

    public void setNoOfMoons(int noOfMoons1) {
        if (noOfMoons1>0&&noOfMoons1<100){
            this.noOfMoons = noOfMoons1;
        }else {
            this.noOfMoons=0;
        }

    }

    public double getAphelion() {
        if (this.aphelion>0&&this.aphelion<50){
            return aphelion;
        }else{
            return aphelion=0;
        }
    }

    public void setAphelion(double aphelion1) {
        if (aphelion1>0&&aphelion1<50){
        this.aphelion = aphelion1;
        }else {
            this.aphelion=0;
        }
    }

    public double getPerihelion() {
        if (this.perihelion>0&&this.perihelion<50){
            return perihelion;
        }else{
            return perihelion=0;
        }

    }

    public void setPerihelion(double perihelion1) {
        if (perihelion1>0&&perihelion1<50){
        this.perihelion = perihelion1;
        }else {
            this.perihelion=0;
        }

    }


}
