package schoolManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

//This application is from a point of view of an account who needs to manage the school's records!
public class Main {
    public static void main(String[] args) {
        List<Teacher> teacherList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        System.out.println("Welcome to the records of Zedan's School of Technology! \n");

        //manually creating school object with students and teachers till i figure out how to make a function for adding new objects!

        var bhavya = new Teacher(1 ,"bhavya",500);
        var malika = new Teacher(2 ,"malika",5000);
        var dhanya = new Teacher(3 ,"dhanya",1000);
        var zedan = new Student(1 , "zedan" , 12);
        var rushaid = new Student(2 , "rushaid" , 5);
        var ruhaim = new Student(3 , "ruhaim" , 10);
        teacherList.add(malika);
        teacherList.add(dhanya);
        teacherList.add(bhavya);
        studentList.add(zedan);
        studentList.add(rushaid);
        studentList.add(ruhaim);


        School zst = new School(teacherList , studentList);

        //functions to the manually created object function!
    }



    public void toPaySalary(Teacher teacherName , int salary ){
        teacherName.recieveSalary(salary);
    }
    public void toRecieveFees(Student studentName , int fees){
        studentName.feesPaid(fees);
    }

}

