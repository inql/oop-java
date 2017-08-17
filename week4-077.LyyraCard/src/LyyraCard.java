/**
 * Created by Dawid on 27.06.2017.
 */
public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart){
        this.balance = balanceAtStart;
    }
    public String toString()
    {
        return "The card has "+this.balance+" euros";
    }

    public void payEconomical()
    {
        if(this.balance>=2.50)
        this.balance -= 2.50;
    }

    public void payGourmet()
    {
        if(this.balance>=4.00)
        this.balance -= 4.00;
    }

    public void loadMoney(double amount)
    {
        if(amount>0)
        {
            double temp = this.balance + amount;
            if(temp>150.00)
                this.balance = 150;
            else
                this.balance = temp;
        }
    }
}
