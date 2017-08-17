import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first number: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.print("Type the second number: ");
        int b = Integer.parseInt(reader.nextLine());
        System.out.println();
        if(a>b)
        {
            System.out.print("Greater number: ");
            System.out.println(a);
        }
        else if (b > a){
            System.out.print("Greater number: ");
            System.out.println(b);
        }
        else
        {
            System.out.println("The numbers are equal!");
        }
    }
}
