import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random randomGenerator;
    private ArrayList<String> responses;
    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        // initialise instance variables
        randomGenerator = new Random();
        responses = new ArrayList<>();
        
        responses.add("yes");
        responses.add("no");
        responses.add("maybe");
        responses.add("");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printOneRandom()
    {
        // put your code here
        System.out.println("New intenger: "+ randomGenerator.nextInt(1000)); 
    }
    
    public void printManyRandomNumbers(int howMany) {
        int count = 0;
        while (count < howMany) {
            printOneRandom();
            count++;
        }
    } 
    
    public int throwDice()
    {
        Random rnd = new Random();
        return rnd.nextInt(6)+ 1;
    }
    
    public String getResponse()
    {
        Random rnd = new Random();
        int choice = rnd.nextInt(3);
        if (choice == 0){
            return "yes";
        } else if (choice == 1){
            return "no";
        }else{
            return "maybe";
        }
    }
    
    public String getBetterResponse(){
        int choice = randomGenerator.nextInt(responses.size());
        return responses.get(choice);
    }
    
    
    
}    
