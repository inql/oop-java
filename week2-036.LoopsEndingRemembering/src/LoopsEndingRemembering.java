import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        int numCount =0;
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        while(true)
        {
            int number = Integer.parseInt(reader.nextLine());
            if(number == -1)
                break;
            sum+= number;
            numCount++;
            if(number % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }
        double average =  (double)sum/numCount;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is "+sum);
        System.out.println("How many numbers: "+numCount);
        System.out.println("Average: "+average);
        System.out.println("Even numbers: "+evenCount);
        System.out.println("Odd numbers: "+oddCount);
    }
}
