package mk224ib_assign3;

import java.util.Random;

public class weapons {
    private String name;
    private int power; // power=number of dice for damage

    public String getName() {
        return name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public weapons(String thename, int thePower){
        this.name=thename;
        this.power=thePower;
    }
    public int damage(){
        int sum=0;
        if (this.power>0){ //normal weapon
            for (int i = 0; i <this.power; i++) {
                sum=(int) ((Math.random() * 6) + 1)+sum;
            }
            return sum;
        }
        else if (power==-1){// hero fist damage if no weapon is carried---damage is between 2-4
            Random r=new Random();
            int low=2;
            int high=5;
            return r.nextInt(high-low)+low;
        }
        else if(this.power==0) {// enemy weapon damage is between 1 and 14
            int damage=(int) ((Math.random() * 14) + 1);
            return damage;
        }else{// exception
            return 0;
        }
    }

}
