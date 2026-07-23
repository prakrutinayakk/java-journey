import java.util.Scanner;
public class exercise2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the value of radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        System.out.print("the circumference value is: " + circumference);

        area = Math.PI * Math.pow(radius, 2);
        System.out.print("the area of the circle is: " + area);

        volume = (4/3)* Math.PI * Math.pow(radius, 2);
        System.out.print("the volume is: " + volume);

        scanner.close();
    }
}
