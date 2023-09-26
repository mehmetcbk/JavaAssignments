package mk224ib_assign3;

public class pointsMain {
    public static void main(String[] args) {
        Point first=new Point(0,0);
        Point second=new Point(3,4);
        double dist=first.distanceTo(second);
        System.out.println(dist);
        System.out.println(first.toString1());
        System.out.println(second.toString1());
        if (first.isEqualTo(second)){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
        first.move(3,4);
        System.out.println(first.getX()+" "+first.getY());
        if (first.isEqualTo(second)){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }
}
