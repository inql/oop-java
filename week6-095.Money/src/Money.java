/**
 * Created by Dawid on 09.07.2017.
 */
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros(){
        return euros;
    }

    public int cents(){
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added)
    {
        return new Money(this.euros+added.euros,this.cents+added.cents);
    }

    public boolean less(Money compared)
    {
        if(this.euros < compared.euros || (this.euros == compared.euros && this.cents<compared.cents) )
            return true;
        return false;
    }

    public Money minus(Money decremented)
    {
        int cents,euros;
        if(this.cents<decremented.cents && this.euros>decremented.euros)
        {
            cents = this.cents+100-decremented.cents;
            euros = this.euros-1-decremented.euros;
        }
        else if(this.less(decremented))
        {
            cents = 0;
            euros = 0;
        }
        else
        {
            cents = this.cents-decremented.cents;
            euros = this.euros-decremented.euros;
        }
        return new Money(euros,cents);
    }

}

