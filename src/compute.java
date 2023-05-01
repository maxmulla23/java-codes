import java.util.Scanner;

class Circle{
    protected double radius;
    void setRadius(double r) {
    radius = r;
    }
    public double getRadius() {
    return radius;
    }
    public double findArea (){
    return Math.PI*Math.pow(radius,2);
    }
    }
    class Cylinder extends Circle{
    private double length;
    void setLength(double l) {
    length = l;
    }
    public double getLength() {
    return length;
    }
    public double findVolume (){
    return findArea()*length;
    }
    }
    public class compute{
    public static void main(String [] args){
    Circle myCircle = new Circle();
    Cylinder myCylinder = new Cylinder();
    Scanner reader=new Scanner(System.in);
    double radius, length;
    System.out.println("Enter the radius of the circle");
    radius=reader.nextDouble();
    myCircle.setRadius(radius);
    myCylinder.setRadius(radius);
    System.out.println("Enter the height of the cylinder");
    length=reader.nextDouble();
    myCylinder.setLength(length);
    System.out.println("The area of circle is: " + 
    myCircle.findArea());
    System.out.println("The volume of cylinder is: " + 
    myCylinder.findVolume());
    }
    }
