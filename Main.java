package schoolManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//This application is from a point of view of an account who needs to manage the school's records!
public class Main {
    public static void main(String[] args) {
        List<Teacher> teacherList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the records of Zedan's School of Technology!");
        Teacher bhavya = new Teacher(1 ,"bhavya",500);
        Teacher malika = new Teacher(2 ,"malika",5000);
        Teacher dhanya = new Teacher(3 ,"dhanya",1000);
        Student zedan = new Student(1 , "zedan" , 12);
        Student rushaid = new Student(2 , "rushaid" , 5);
        Student ruhaim = new Student(3 , "ruhaim" , 10);
        teacherList.add(malika);
        teacherList.add(dhanya);
        teacherList.add(bhavya);
        studentList.add(zedan);
        studentList.add(rushaid);
        studentList.add(ruhaim);
        School zst = new School(teacherList , studentList);
        System.out.println(studentList);
        System.out.println(teacherList);
        System.out.println(zst);
    }
}

