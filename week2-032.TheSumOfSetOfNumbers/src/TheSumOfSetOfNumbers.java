
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int limit = Integer.parseInt(reader.nextLine());
        int i = 1;
        int sum = 0;
        while(i<=limit)
        {
            sum+=i++;
        }
        System.out.println("Sum is "+sum);
    }
}
