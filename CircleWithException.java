import java.util.*;
import java.lang.Math;

public class CircleWithException {
    private float radius ;    
    

    public static void main(String[] args) {
        String choice;
        float radius;
        double area;
        boolean program_state = true;
        CircleWithException circle = new CircleWithException();
        Scanner scan = new Scanner(System.in);
        while (program_state){
            System.out.println(" (a) Set radius (b) get radius (c) get area (d) get diameter ");
            System.out.print("Enter choice:");
            choice = scan.nextLine();
            switch (choice) {
                case "a":
                    try {
                        System.out.print("Enter radius: ");
                        choice = scan.nextLine();
                        radius = Float.valueOf(choice);
                        if (radius <0.0){
                            throw new IllegalArgumentException();
                        }
                        circle.setRadius(radius);
                    } catch ( IllegalArgumentException e) {
                        System.out.println("Exception caught in setRadius() : "+ e);
                    }
                break;
                case "b":
                    System.out.println("Circle radius:" + circle.getRadius());
                break;
                case "c":
                    try{
                        area = circle.getArea();
                        if (area> 1000){
                            throw new Exception();
                        }
                        System.out.println("Circle area: " + area);
                    }
                    catch(Exception e ){
                        System.out.println("Area is larger than 1000, Exception Caught: " + e);
                    }                    
                break;
                case "d":
                    System.out.println("Circle Diameter: " + circle.getDiameter());
                break;
            
                default:
                    program_state = false;
                    scan.close();
                break;
            }
            System.out.println("");
        }
    }
    public CircleWithException( )  {
        this.radius = 1;
    }


    public CircleWithException(float radius )  {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double getArea(){
        return(Math.PI * this.radius * this.radius);
    }
    public float getDiameter(){
        return(this.radius * 2);
    }

}
