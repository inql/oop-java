
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.print("Type your name: ");
        String fName = reader.nextLine();
        System.out.print("Type your age: ");
        int fAge = Integer.parseInt(reader.nextLine());
        System.out.println();
        System.out.print("Type your name: ");
        String sName = reader.nextLine();
        System.out.print("Type your age: ");
        int sAge = Integer.parseInt(reader.nextLine());
        System.out.println();
        System.out.println(fName+" and "+sName+" are "+(fAge+sAge)+" years old in total.");

    }
}
