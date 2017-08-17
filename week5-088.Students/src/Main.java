
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);


        String name;
        String studentNumber;

        while(true)
        {
            System.out.print("name: ");
            name = reader.nextLine();
            if(name.isEmpty())
                break;
            System.out.print("studentnumber: ");
            studentNumber = reader.nextLine();

            Student stud = new Student(name,studentNumber);
            list.add(stud);
        }

        System.out.println();

        for (Student item : list)
            System.out.println(item);

        System.out.print("Give search term: ");
        String given = reader.nextLine();

        System.out.println("Result: ");

        for(Student item : list)
        {
            if(item.getName().contains(given))
                System.out.println(item);
        }
    }
}