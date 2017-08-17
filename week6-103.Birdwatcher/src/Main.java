import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String choice;
        int check = 0;
        BirdStats birdStats = new BirdStats();
        while(check == 0)
        {
            System.out.print("? ");
            choice = reader.nextLine();

            switch (choice)
            {
                case "Add":
                    add(reader,birdStats);
                    break;
                case "Observation":
                    observation(reader,birdStats);
                    break;
                case "Statistics":
                    statistics(birdStats);
                    break;
                case "Show":
                    show(reader,birdStats);
                    break;
                case "Quit":
                    check = 1;
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }

        }

    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
            
    }

    public static void add(Scanner reader, BirdStats birdStats)
    {
        System.out.print("Name: ");
        String name = reader.nextLine();
        System.out.print("Latin name: ");
        String latinName = reader.nextLine();
        birdStats.addBird(new Bird(name,latinName));
    }

    public static void observation(Scanner reader, BirdStats birdStats)
    {
        System.out.print("What was observed:? ");
        String name = reader.nextLine();
        birdStats.observe(birdStats.findByName(name));
    }

    public static void statistics(BirdStats birdStats)
    {
        birdStats.printAll();
    }

    public static void show(Scanner reader, BirdStats birdStats)
    {
        System.out.print("What? ");
        String name = reader.nextLine();
        birdStats.printBird(birdStats.findByName(name));

    }



}
