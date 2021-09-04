package schoolManagementSystem;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id , String name , int grade){
        this.id=id;
        this.name=name;
        this.grade=grade;
        feesPaid=0;
        feesTotal=30000;
    }

    //updating grades
    public void setGrade(int grade) {
        this.grade = grade;
    }

    //continuous adding of fees
    public void feesPaid(int fees) {
        feesPaid+=fees;
        School.updateTotalMoneyEarned(fees);
    }

    //return id of the student
    public int getId() {
        return id;
    }

    //return name of the student
    public String getName() {
        return name;
    }

    //return grade of the child
    public int getGrade() {
        return grade;
    }

    //return total fees paid by the student currently
    public int getFeesPaid() {
        return feesPaid;
    }

    //returns the total fees!
    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFess(){
        return feesTotal-feesPaid;
    }

    //changing default to string to user readable manner!
    @Override
    public String toString() {
        return "Student's Name is : " + name +
                "\n" + "Total fees paid by " +
                name + ": $" + feesPaid + '\n';
    }
}
