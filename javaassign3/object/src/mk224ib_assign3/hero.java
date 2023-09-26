package mk224ib_assign3;

public class hero {
    private String name;
    private int health;
    //default weapon
    private String weaponName="fist";
    private int weaponPower=-1; //hero fist damage
    weapons heroW=new weapons(weaponName,weaponPower);

    public weapons getHeroW() {
        return heroW;
    }

    public void setHeroW(weapons heroW) {
        this.heroW = heroW;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public int getWeaponPower() {
        return weaponPower;
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

    public hero(String thename, int theHealth){
        this.name=thename;
        this.health=theHealth;
    }

    public int attack(){
        int first=(int) ((Math.random() * 6) + 1);
        int second=(int) ((Math.random() * 6) + 1);
        int third=(int) ((Math.random() * 6) + 1);
        return first+second+third;
    }

    public int defence(){
        int first=(int) ((Math.random() * 6) + 1);
        int second=(int) ((Math.random() * 6) + 1);
        int third=(int) ((Math.random() * 6) + 1);
        return first+second+third;
    }

}
