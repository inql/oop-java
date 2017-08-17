/**
 * Created by Dawid on 28.06.2017.
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit)
    {
        this.upperLimit = upperLimit;
        value = 0;
    }

    public void next()
    {
        this.value++;
        if(this.value>this.upperLimit)
            this.value =0;
    }

    public String toString()
    {
        if(this.value <=9)
            return "0"+value;
        else
        return ""+value;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int newValue)
    {
        if(newValue >= 0 && newValue <= this.upperLimit)
            this.value = newValue;
    }
}
