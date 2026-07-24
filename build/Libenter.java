import java.util.Scanner;
public class Libenter {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        boolean hasStudentID = true;
        boolean isOverdue= false;
        boolean isBanned= false;
        boolean post10PM= true;
        boolean hasPass = true;

        if(hasStudentID)
        {
            System.out.println("Welcome to the library! We have confirmed you are a student");
            if(isOverdue){
                System.out.println("You have books overdue. You will be charged a fine before being allowed in. Do you want to pay?");
            }
            else{
                System.out.println("You do not have books overdue! You may proceed.");
                if(isBanned){
                    System.out.println("You have been banned from the library. Please consult the librarian or the concerned authorities!");
                }
                else{
                    System.out.println("You are not banned! Please co-operate while we process a few extra things.");
                    if(post10PM){
                        System.out.println("It is past 10 PM! You might require a night pass.");
                        if(hasPass){
                            System.out.println("Pass verified successfully. Happy learning!");
                        }
                        else{
                            System.out.println("You do not have the required pass. Please return with one.");
                        }
                    }
                    else{
                        System.out.println("No curfew. Happy learning!");
                    }
                }
            }
        }
        else{
            System.out.println("You do not possess an ID. You are not allowed to access the library!");
        }

        scanner.close();
    }
    
}
