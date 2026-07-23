import java.util.Scanner;

public class exercise1{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        double base;
        double height;
        double hypotenuse;

        System.out.println("PYTHAGORAS THEOREM");

        System.out.println("Enter a value for base of the triangle : ");
        base = scanner.nextDouble();

        System.out.println("Enter a value for height of the triangle : ");
        height = scanner.nextDouble();

        hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));

        System.out.println("The value of the hypotenuse is : " + hypotenuse);

    }
}