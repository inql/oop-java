import java.util.ArrayList;

/**
 * Created by Dawid on 12.07.2017.
 */
public class BirdStats {

    private ArrayList<Bird> list;

    public BirdStats()
    {
        this.list = new ArrayList<Bird>();
    }

    public void addBird(Bird bird)
    {
        list.add(bird);
    }

    private boolean isExists(Bird bird)
    {
        if(list.contains(bird))
        {
            return true;
        }
        System.out.println("Is not a bird!");
        return false;
    }

    public void observe(Bird bird)
    {
        if(isExists(bird))
        bird.addObservation();
    }

    public Bird findByName(String name)
    {

        for(Bird item:list)
        {
            if(item.getName().equals(name))
                return item;
        }

        return null;

    }

    public void printBird(Bird bird)
    {
        if(isExists(bird))
        System.out.println(bird);
    }

    public void printAll()
    {
        for(Bird item:list)
        {
            System.out.println(item);
        }
    }


}
