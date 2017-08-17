
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here.
        while(true)
        {
            System.out.print("Input a number(float): ");
            double numer = Double.parseDouble(reader.nextLine());
            if (numer < -30 || numer > 40)
                continue;
            Graph.addNumber(numer);
        }

    }
}