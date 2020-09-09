import java.lang.Math.*;

// Трёхмерная точка 
public class Point3d extends Point2d {

    //Coordinates
    private double zCoord;

    //Constructors
    public Point3d(){
        super();
        zCoord = 0.0;
    }
    public Point3d(double x, double y, double z){
        // xCoord = x;
        // yCoord = y;
        super(x,y);
        zCoord = z;
    }

    //getters
    // public double getX()
    // {
    //     return xCoord;
    // }
    // public double getY()
    // {
    //     return yCoord;
    // }
    public double getZ()
    {
        return zCoord;
    }
    
    //setters
    // public void setX(double x)
    // {
    //     xCoord = x;
    // }
    // public void setY(double y)
    // {
    //     yCoord = y;
    // }
    public void setZ(double z)
    {
        zCoord = z;
    }
    
    public boolean equals(Point3d a){
        if (this.xCoord == a.xCoord && this.yCoord == a.yCoord && this.zCoord == a.zCoord){
            return true;
        }
        return false;
    }

    public double getDistance(Point3d a){ 
        return Math.sqrt(Math.pow(this.xCoord - a.xCoord,2) + Math.pow(this.yCoord - a.yCoord,2) + Math.pow(this.zCoord - a.zCoord,2) );
    }

}




