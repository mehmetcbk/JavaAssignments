package mk224ib_assign3;

import java.util.Scanner;

public class moonMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter name for moon: ");
        String name=sc.nextLine();
        System.out.print("enter diameter");
        int dia=sc.nextInt();
        moon a=new moon(name,dia);
        System.out.println("name of the moon is "+a.getName()+" with diameter "+a.getDiameter());
    }
}
