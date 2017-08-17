import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    public Person(String name)
    {
        this.name = name;
        this.birthday = new MyDate(Calendar.getInstance().get(Calendar.DATE),Calendar.getInstance().get(Calendar.MONTH) + 1,Calendar.getInstance().get(Calendar.YEAR));
    }

    public Person(String name, MyDate birthday)
    {
        this.name = name;
        this.birthday = birthday;
    }
    
    
    public int age() {
        // calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        int curDay = Calendar.getInstance().get(Calendar.DATE);
        int curMonth =  Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int curYear = Calendar.getInstance().get(Calendar.YEAR);
        MyDate curDate = new MyDate(curDay,curMonth,curYear);

        return this.birthday.differenceInYears(curDate);
    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        if(!this.birthday.earlier(compared.birthday))
        return false;
        return true;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
