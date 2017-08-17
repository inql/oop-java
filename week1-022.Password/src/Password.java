
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        while(true)
        {
            System.out.print("Type the password: ");
            String input = reader.nextLine();
            if(input.equals(password))
            {
                System.out.println("Right!\nThe secret is: jrry qbar!");
                break;
            }
            else
            {
                System.out.println("Wrong!");
            }
        }

        // Write your code here
    }
}
