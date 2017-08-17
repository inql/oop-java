
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int limit = Integer.parseInt(reader.nextLine());
        int i = 0;
        int sumPowers = 0;
        while (i<=limit)
        {
            sumPowers+=Math.pow(2,i++);
        }
        System.out.println("The result is "+(int)sumPowers);
    }
}
