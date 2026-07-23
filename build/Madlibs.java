import java.util.Scanner;

public class Madlibs {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);

        String adjective1;
        String adjective2;
        String noun1;
        String noun2;
        String noun3;
        String verb1;
        String verb2;

        System.out.print("Enter adjective 1: ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter adjective 2: ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter noun 1: ");
        noun1 = scanner.nextLine();
        System.out.print("Enter noun 2: ");
        noun2 = scanner.nextLine();
        System.out.print("Enter noun 3: ");
        noun3 = scanner.nextLine();
        System.out.print("Enter verb 1: ");
        verb1 = scanner.nextLine();
        System.out.print("Enter verb 2: ");
        verb2 = scanner.nextLine();

        System.out.println("On this beautiful day " + noun1 + " woke up feeling " + adjective1 + " and "  + adjective2 + " so he " + verb1 + " through his home." );
        System.out.print(" He had a breakfast of " + noun2 + " and went to work.");
        System.out.print("On the way he met his pet " + noun3 + " so he put the pet in the car with him and gave treats.");
        System.out.print(noun3 + " ate his treats well and fell asleep which " + verb2 + noun1 + " off so he threw it out. ");
        scanner.close();
    }
}