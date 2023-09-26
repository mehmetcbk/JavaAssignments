package mk224ib_assign3;

import java.util.Scanner;

public class gameManager {
    public static void main(String[] args) {
        hero theHero=new hero("darth vader",100);
        enemy theEnemy=new enemy("darth sidious",100);
        weapons heroWeapon=new weapons("lightsaber",3);
        weapons enemyWeapon=new weapons("force lightning",0);
        //if the weapons are not set before they will fight with no weapon
        theHero.setHeroW(heroWeapon);//hero weapon
        theEnemy.setEnemyW(enemyWeapon);//enemy weapon

        boolean run=true;

        int round=1;
        while (run) {
            if (theHero.getHealth() > 0&& theEnemy.getHealth() > 0) {
                System.out.println("round: " + round +" "+theHero.getName()+" health: " + theHero.getHealth() +" "+theEnemy.getName() +" health: " + theEnemy.getHealth());
                boolean heroAttack = true;
                boolean enemyAttack = false;

                while (heroAttack) {
                    if (theEnemy.getHealth()<0||theHero.getHealth()<0){//prevent last attack before dying
                        break;
                    }
                    if (theHero.attack() > theEnemy.defence()) {
                        int damage=theHero.heroW.damage();
                        System.out.println(theHero.getName()+" hits with "+theHero.heroW.getName()+" damage dealt is: "+damage);
                        theEnemy.setHealth(theEnemy.getHealth() - damage);
                        enemyAttack = true;
                        heroAttack = false;

                    } else {
                        System.out.println(theEnemy.getName()+" dodges attack from "+theHero.getName());
                        enemyAttack = true;
                        heroAttack = false;
                        break;
                    }

                }
                while (enemyAttack) {
                    if (theEnemy.getHealth()<0||theHero.getHealth()<0){//prevent last attack before dying
                        break;
                    }
                    if (theEnemy.attack() > theHero.defence()) {
                        int damage=theEnemy.enemyW.damage();
                        System.out.println(theEnemy.getName()+" hits with "+theEnemy.enemyW.getName()+" damage dealt is: "+damage);
                        theHero.setHealth(theHero.getHealth() - damage);
                        heroAttack = true;
                        enemyAttack = false;

                    } else {
                        System.out.println(theHero.getName()+" dodges attack from "+theEnemy.getName());
                        heroAttack = true;
                        enemyAttack = false;
                        break;
                    }

                }

                round = round + 1;

            }

            else{
                if (theHero.getHealth()<1){
                    System.out.println("---------------------------------");
                    System.out.println(theHero.getName()+" is defeated ");
                    System.out.println(theEnemy.getName()+" wins");
                }else if (theEnemy.getHealth()<1){
                    System.out.println("----------------------------------");
                    System.out.println(theEnemy.getName()+" is defeated ");
                    System.out.println(theHero.getName()+" wins");
                }
                //to get health at the end
                //System.out.println("hero health: "+theHero.getHealth());
                //System.out.println("enemy health: "+theEnemy.getHealth());
                
                run=false;
            }
        }
    }
}
