import java.util.Scanner;
public class interestcalc {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);

        int n;
        int t;
        double r;
        double p;
        double a;

        System.out.print("Enter the principal you started with: ");
        p = scanner.nextDouble();
        System.out.print("Enter the interest: ");
        r = scanner.nextDouble();
        r=r/100;
        System.out.print("Enter the number of years : ");
        t=scanner.nextInt();
        System.out.print("Enter the times calculated : ");
        n=scanner.nextInt();
        a = p*Math.pow(1+r/n, n*t);
        System.out.printf("The amount is $%.2f in %d years", a,t );

        scanner.close();

    }
}
