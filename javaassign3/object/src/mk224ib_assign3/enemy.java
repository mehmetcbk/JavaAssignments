package mk224ib_assign3;

public class enemy {
    private String name;
    private int health;
    //default weapon
    private String weaponName="fist";
    private int weaponPower=0;//enemy weapon damage
    weapons enemyW=new weapons(weaponName,weaponPower);

    public weapons getEnemyW() {
        return enemyW;
    }

    public void setEnemyW(weapons enemyW) {
        this.enemyW = enemyW;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public enemy(String theName, int theHealth){
        this.health=theHealth;
        this.name=theName;

    }
    public int attack(){
        int first=(int) ((Math.random() * 5) + 1);
        int second=(int) ((Math.random() * 5) + 1);
        int third=(int) ((Math.random() * 5) + 1);
        return first+second+third;
    }
    public int defence(){
        int first=(int) ((Math.random() * 5) + 1);
        int second=(int) ((Math.random() * 5) + 1);
        int third=(int) ((Math.random() * 5) + 1);
        int forth=(int) ((Math.random() * 5) + 1);
        return first+second+third+forth;
    }

}
