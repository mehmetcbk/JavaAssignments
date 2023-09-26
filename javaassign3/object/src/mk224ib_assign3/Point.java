package mk224ib_assign3;

public class Point {
    private int x;
    private int y;

    public Point(int first, int second){
        this.x=first;
        this.y=second;
    }
    public String toString1(){ // it overrides object.java so i changed it
        String a="("+Integer.toString(this.x)+","+Integer.toString(this.y)+")";
        return a;
    }
    public Double distanceTo(Point p2){
        int x1=this.x;
        int y1=this.y;
        int x2=p2.x;
        int y2=p2.y;
        return Math.sqrt((Math.pow(x1-x2,2)+Math.pow(y1-y2,2)));

    }
    public Boolean isEqualTo(Point p2){
        if (this.x==p2.x&&this.y==p2.y){
            return true;
        }else{
            return false;
        }
    }
    public void move(int a,int b){
        this.x=this.x+a;
        this.y=this.y+b;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
