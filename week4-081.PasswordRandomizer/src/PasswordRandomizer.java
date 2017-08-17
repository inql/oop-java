import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int passLength;
    private Random random;
    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.passLength = length;
        random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        String result = "";
        int i =0;
        while(i<passLength)
        {

            result+="abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(25)+1);
            i++;
        }
        return result;
    }
}
