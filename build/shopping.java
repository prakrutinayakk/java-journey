import java.util.Scanner;
public class shopping{
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int quantity;
        double price;
        String name;
        double total;

        System.out.print("What is the name of the item?");
        name = scanner.nextLine();
        System.out.print("What is the price of the item?");
        price = scanner.nextDouble();
        System.out.print("What is the quantity of the item?");
        quantity = scanner.nextInt();

        total = quantity * price;

        System.out.println("\n");
        System.out.println("YOUR SHOPPING RECEIPT"); 
        System.out.print("Your shopping total is " + total);
        scanner.close();
    }
}