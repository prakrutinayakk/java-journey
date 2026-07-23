import java.util.Scanner;

public class Area{
    public static void main (String[] args){
    double lengthr = 0;
    double widthr = 0;
    double arear = 0;
    double lengths = 0;
    double areas = 0;

    Scanner scanner = new Scanner(System.in);

    System.out.println("RECTANGLE");
    System.out.print("Enter the length of the rectangle : ");
    lengthr = scanner.nextDouble();
    System.out.print("Enter the width of the rectangle : ");
    widthr = scanner.nextDouble();

    arear = lengthr * widthr ;
    System.out.println("Area of the given rectangle is : " +arear);
     
    System.out.println("SQUARE");
    System.out.print("Enter the measure of the side of the square : ");
    lengths = scanner.nextDouble();

    areas = lengths * lengths;
    System.out.println("Area of the square is : " +areas);

    scanner.close();
    
    }

}