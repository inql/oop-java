/**
 * Created by Dawid on 09.07.2017.
 */
public class Person {

    private String name;
    private String number;

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    public String toString()
    {
        return this.name+" number: "+this.number;
    }

    public Person(String name, String number)
    {
        this.name = name;
        this.number = number;
    }

    public void changeNumber(String newNumber)
    {
        this.number = newNumber;
    }





}
