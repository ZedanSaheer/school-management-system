package schoolManagementSystem;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id,String name , int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        salaryEarned=0;
    }

    //return id of the teacher
    public int getId(){
        return id;
    }

    //return name of the teacher
    public String getName(){
        return name;
    }

    //return salary of the teacher
    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void recieveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }

    //to display object name on call in readable manner
    @Override
    public String toString() {
        return "Teacher's Name is : " + name +
                "\n" + "Total salary earned by " +
                name + " : $" + salaryEarned + "\n";
    }
}
