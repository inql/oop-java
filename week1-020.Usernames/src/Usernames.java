
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[][] info = new String[2][2];
        info[0][0] = "alex";
        info[0][1] = "mightyducks";
        info[1][0] = "emily";
        info[1][1] = "cat";
        System.out.print("Type your username: ");
        String username = reader.nextLine();
        System.out.print("Type your password: ");
        String password = reader.nextLine();
        if((username.equals(info[0][0]) && password.equals(info[0][1])) || ((username.equals(info[1][0])) && password.equals(info[1][1])))
        {
            System.out.println("You are now logged into the system!");
        }
        else
        {
            System.out.println("Your username or password was invalid!");
        }
    }
}
