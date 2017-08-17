/**
 * Created by Dawid on 11.07.2017.
 */
public class Grade {


    public int getScore() {
        return score;
    }

    public int getResult() {
        return result;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    private int score;
    private int result;
    private boolean isAccepted;


    public Grade(int score)
    {
        if(score >= 0 && score <= 60)
            this.score = score;
        if(score >= 0 && score < 30)
        {
            this.result = 0;
            this.isAccepted = false;
        }
        else if(score >= 30 && score < 35)
        {
            this.result = 1;
            this.isAccepted = true;
        }
        else if(score >= 35 && score < 40)
        {
            this.result = 2;
            this.isAccepted = true;
        }
        else if(score >= 40 && score < 45)
        {
            this.result = 3;
            this.isAccepted = true;
        }
        else if(score >= 45 && score < 50)
        {
            this.result = 4;
            this.isAccepted = true;
        }
        else if(score >= 50 && score < 61)
        {
            this.result = 5;
            this.isAccepted = true;
        }
    }




}
