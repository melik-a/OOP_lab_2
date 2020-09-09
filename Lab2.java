import java.lang.Math.*;
public class Lab2 {
    public static void main(String[] args) {
        Point3d aDot = new Point3d(3,1,2);
        Point3d bDot = new Point3d(5,2,4);
        Point3d cDot = new Point3d(1,6,-2);
        double s = computeArea(aDot, bDot, cDot);
        System.out.println("Area of the triangle is " + s);
    }

    public static double computeArea(Point3d a, Point3d b, Point3d c){
        if (a.equals(b) && b.equals(c) && c.equals(a)){
            System.out.println("Some points are equal.");
            return 0;
        }
        double p = (a.getDistance(b) + b.getDistance(c) + c.getDistance(a))/2;
        return Math.sqrt(p * (p - a.getDistance(b)) * (p - b.getDistance(c)) * (p - c.getDistance(a))); 
    }
}