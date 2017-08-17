import java.util.ArrayList;

/**
 * Created by Dawid on 10.07.2017.
 */
public class Library {

    private ArrayList<Book> list;

    public Library()
    {
        this.list = new ArrayList<Book>();
    }

    public void addBook(Book newBook)
    {
        list.add(newBook);
    }

    public void printBooks()
    {
        for(Book item:list)
        {
            System.out.println(item);
        }
    }

    public ArrayList<Book> searchByTitle(String title)
    {
        ArrayList<Book> result = new ArrayList<Book>();
        for(Book item:list)
        {
            if(StringUtils.included(item.title(), title))
                result.add(item);
        }
        return result;
    }

    public ArrayList<Book> searchByPublisher(String publisher)
    {
        ArrayList<Book> result = new ArrayList<Book>();
        for(Book item:list)
        {
            if(StringUtils.included(item.publisher(), publisher))
                result.add(item);
        }
        return result;
    }

    public ArrayList<Book> searchByYear(int year)
    {
        ArrayList<Book> result = new ArrayList<Book>();
        for(Book item:list)
        {
            if(item.year()==year)
                result.add(item);
        }
        return result;
    }

}
