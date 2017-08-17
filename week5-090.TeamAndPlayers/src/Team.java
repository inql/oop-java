import java.util.ArrayList;

/**
 * Created by Dawid on 09.07.2017.
 */
public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;

    public String getName(){return this.name;}

    public Team(String name)
    {
        this.players = new ArrayList<Player>();
        this.name = name;
        this.maxSize = 16;
    }

    public void addPlayer(Player newPlayer)
    {
        if(this.players.size()<this.maxSize)
        this.players.add(newPlayer);
    }

    public void printPlayers()
    {
        for(Player item:this.players)
        {
            System.out.println(item);
        }
    }

    public void setMaxSize(int maxSize)
    {
        this.maxSize = maxSize;
    }

    public int size(){return this.players.size();}

    public int goals()
    {
        int goalsTotal=0;
        for(Player item:this.players)
        {
            goalsTotal+=item.goals();
        }
        return goalsTotal;
    }

}
