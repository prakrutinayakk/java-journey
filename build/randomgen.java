import java.util.Random;
public class randomgen{
    public static void main(String [] args){
        Random random = new Random();
        int number;

        System.out.println("Your random number is");
        number = random.nextInt(1, 98);
        System.out.println(number);

    }
}