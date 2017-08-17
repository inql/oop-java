import java.util.ArrayList;

/**
 * Created by Dawid on 09.07.2017.
 */
public class Phonebook {

    private ArrayList<Person> list;

    public Phonebook()
    {
        this.list = new ArrayList<Person>();
    }

    public void add(String name, String number)
    {
        this.list.add(new Person(name,number));
    }

    public void printAll()
    {
        for(Person item:this.list)
        {
            System.out.println(item);
        }
    }

    public String searchNumber(String name)
    {
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getName()==name)
            {
                return list.get(i).getNumber();
            }

        }
        return "number not known";
    }

}
