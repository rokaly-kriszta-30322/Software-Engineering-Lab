package isp.lab3.exercise4;

import isp.lab3.exercise3.Vehicle;

public class MyPoint {

    private int x;
    private int y;
    private int z;

    public MyPoint() {
        x = 0;
        y = 0;
        z = 0;
    }

    public MyPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString() {
        return getX() + ", " + getY() + ", " + getZ();
    }

    public double distance(int x, int y, int z) {
        int xDis = this.x - x;
        int yDis = this.y - y;
        int zDis = this.z - z;

        return Math.sqrt(xDis*xDis + yDis*yDis + zDis*zDis);
    }

    public double distance(MyPoint another) {
        int xDis = this.x - another.getX();
        int yDis = this.y - another.getY();
        int zDis = this.y - another.getY();

        return Math.sqrt(xDis*xDis + yDis*yDis + zDis*zDis);
    }

    public static void main(String[] args){
        MyPoint p;
        MyPoint p2;
        p = new MyPoint();
        p2 = new MyPoint(3, 3, 3);

        System.out.println(p2.distance(0, 0, 0));
        System.out.println(p.distance(p2));
    }

}