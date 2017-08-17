/**
 * Created by Dawid on 12.07.2017.
 */
public class Bird {

    public String getName() {
        return name;
    }

    private String name;
    private String latinName;
    private int numOfObservations;

    public Bird(String name, String latinName)
    {
        this.name = name;
        this.latinName = latinName;
        this.numOfObservations = 0;
    }

    public void addObservation()
    {
        numOfObservations++;
    }

    public String toString()
    {
        return this.name+" ("+this.latinName+"): "+this.numOfObservations+" observations";
    }






}
