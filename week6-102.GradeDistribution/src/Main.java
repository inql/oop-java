import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        GradesList list = new GradesList();
        System.out.println("Type exam scores, -1 completes:");
        while(true)
        {
            if(!input(lukija, list))
                break;
        }
        list.printAll();
    }

    public static boolean input(Scanner reader, GradesList list)
    {
        int score = Integer.parseInt(reader.nextLine());
        if(score>=0 && score <=60)
        {
            list.addGrade(new Grade(score));
            return true;
        }
        else if(score == -1)
            return false;
        else
            return true;
    }
}
