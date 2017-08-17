import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int factorial = 1;
        int i = 1;
        System.out.print("Type a number: ");
        int limit = Integer.parseInt(reader.nextLine());
        while(i<=limit)
        {
            factorial*=i++;
        }
        System.out.println("Factorial is "+factorial);
    }
}
