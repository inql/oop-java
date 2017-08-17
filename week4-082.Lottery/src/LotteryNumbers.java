import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.numbers = new ArrayList<Integer>();
        random = new Random();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        // Write the number drawing here using the method containsNumber()
        this.numbers = new ArrayList<Integer>();
        int i =0;
        while(i<7)
        {
            int number = random.nextInt(39)+1;
            if(!containsNumber(number))
            {
                this.numbers.add(number);
                i++;
            }
            else
                continue;

        }


    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (this.numbers.contains(number))
            return true;
        else
            return false;
    }
}
