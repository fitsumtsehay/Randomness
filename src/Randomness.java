// Code to generate 10 random integers from 1 to 6
import java.util.Random;
public class Randomness {
    public static void main (String[] args)
    {
                    System.out.println("Generate 10 random integers between 0 and 6");
        Random rnd = new Random(); // create instance of random class
        for (int i = 1; i <= 10; ++i)
        {
            int randomInt = 1 + rnd.nextInt( 6);
            System.out.println("Generated number: " + randomInt);
        }
        System.out.println("Done.");
    }
    private static void output(String aMessage){
        System.out.println(aMessage);
    }
}
