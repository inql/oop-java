import java.util.ArrayList;

/**
 * Created by Dawid on 11.07.2017.
 */
public class GradesList {

    private ArrayList<Grade> grades;

    public GradesList()
    {
        this.grades = new ArrayList<Grade>();
    }

    public void addGrade(Grade grade)
    {
            this.grades.add(grade);
    }

    private int numOfAccepted()
    {
        int accepted = 0;
        for(Grade item:grades)
        {
            if(item.isAccepted())
                accepted++;
        }
        return accepted;
    }

    public double acceptancePercentage()
    {
        return (double)this.numOfAccepted()*100/this.grades.size();
    }

    private int numOfGrades(int result)
    {
        int numOfGrades = 0;

        for(Grade item:grades)
        {
            if(item.getResult()==result)
                numOfGrades++;
        }

        return numOfGrades;
    }

    public void printNumOfGrades(int result)
    {
        System.out.print(result+": ");
        for(int i =0; i<numOfGrades(result);i++)
            System.out.print("*");
        System.out.println();
    }

    public void printAll()
    {
        System.out.println("Grade distribution:");
        for(int i=5;i>=0;i--)
        {
            printNumOfGrades(i);
        }
        System.out.println("Acceptance percentage: "+this.acceptancePercentage());
    }


}
