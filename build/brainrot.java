import java.util.Scanner;
import java.util.Random;

public class brainrot {
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        Random random = new Random();

        String place;
        int character;

        System.out.println("BESTIE WELCOME TO THE ADVENTURE!!");

        System.out.println("Enter any random place : ");
        place = scanner.nextLine();
        
        character= random.nextInt(1, 5);
        System.out.println(character);

        System.out.println("1. triple t 2. bombardiro crocodilo  3. chimpanzini bananini  4. zhea");

        System.out.println("aww good luck bestie! have fun with your assigned character being stuck in " + place);

        scanner.close();


    }
}
