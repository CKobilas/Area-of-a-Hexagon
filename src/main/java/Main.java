import java.util.*;
public class Main {
  public static void main(String[] args) {

     //prompt user to enter a side for the hexagon
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the side: ");
    double s = input.nextDouble();

    //write the calculation for the area of the hexagon
    
    double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));

    ////Display the results
    System.out.printf("The are of the hexagon is %.2f", area);

    
  }
}