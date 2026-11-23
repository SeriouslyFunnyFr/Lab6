
/**
 * Manage triangle objects
 *
 * @author Ari Hayete
 * @version v1.0
 * @since Nov 3, 2026
 */
import java.util.Scanner;
public class Triangle
{
    private String name;
    private double base, height;
    
    /**
     * Constructor, sets name to Unkown, base to 0.0, height to 0.0
     */
    public Triangle(){
        name = "Unkown";
        base = 0.0;
        height = 0.0;
    }
    /**
     * Constructor when values want to be set by user
     * 
     * @param inName the name of the triangle
     * @param inBase the base of the triangle to be created
     * @param inHeight the height of the triangle
     */
    public Triangle(String inName, double inBase, double inHeight){
        name = inName;
        base = inBase;
        height = inHeight;
    }
    /**
     * Write the output of the object
     */
    public void writeOutput(){
        System.out.printf("Triangle name is: " + name + "\nTriangle base is: %.1f\nTriangle height is: %.1f\nTriangle area is: %.1f\n\n", base, height, getArea());
        //extra \n at the end to match expected output
    }
    /**
     * Read input to set the fields of the object
     */
    public void readInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the triangle's name: ");
        name = scan.nextLine();
        System.out.println("What is the triangle's base: ");
        base = scan.nextDouble();
        System.out.println("What is the triangle's height: ");
        height = scan.nextDouble();
        System.out.println(); //extra to match expected output
    }
    /**
     * Mutator method to set a new name
     * 
     * @param newName the new name for the triangle
     */
    public void setName(String newName){
        name = newName;
    }
    /**
     * Mutator to set a new base
     * 
     * @param newBase the new value for the base
     */
    public void setBase(double newBase){
        base = newBase;
    }
    /**
     * mutator to set a new height
     * 
     * @param newHeight the new value for the height
     */
    public void setHeight(double newHeight){
        height = newHeight;
    }
    /**
     * private method to calculate the area of a triangle 
     * 
     * @return the area as a double, using stored base and height
     */
    private  double getArea(){
        return base * height / 2.0;
    }
}