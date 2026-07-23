import java.util.Scanner;

public class ifelse{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int hours;
        //SCREEN TIME ROAST
        System.out.print("What is your screen time today?");
        hours = scanner.nextInt();
        System.out.println("Aight your screen time is " + hours + " hours.");
        if (hours<2)
        {
            System.out.println("holy productivity");
        }
        else if(hours>=15){
            System.out.println("bro dont touch grass. grass touch bro.");
        }
        
        else if (hours >= 5){
            System.out.println("broski on the verge of unemployment");
        }
        else{
            System.out.println("aight lemme pay for therapy");
        }
        scanner.close();
    }
        

    }
