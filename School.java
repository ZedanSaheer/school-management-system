package schoolManagementSystem;

import java.util.List;

public class School {
        private static List<Teacher> teachers;
        private static List<Student> students;
        private static int totalMoneyEarned;
        private static int totalMoneySpent;

        //new school object with list of teachers and students as @params
        public School(List<Teacher> teachers, List<Student> students) {
                School.teachers = teachers;
                School.students = students;
                totalMoneyEarned=0;
                totalMoneySpent=0;
        }

        //returns the list of teachers in the school
        public List<Teacher> getTeachers() {
                return teachers;
        }

        //deletes a teacher
        public void removeTeacher(Teacher element){
                teachers.remove(element);
        }

        //adds new teacher to the list of teachers
        public void addTeachers(Teacher teacher) {
               teachers.add(teacher);
        }

        //return the list of students in the school
        public List<Student> getStudents() {
                return students;
        }

        //adds new student to the list of students
        public static void addStudents(Student student) {
               students.add(student);
        }

        //deletes a student
        public static void removeStudent(Student student){
                students.remove(student);
        }

        //the total money earned by the school
        public int getTotalMoneyEarned() {
                return totalMoneyEarned;
        }

        //this updates the total money earned by the school
        public static void updateTotalMoneyEarned(int moneyEarned) {
                totalMoneyEarned+=moneyEarned;
        }

        //gets the total money spent by the school
        public int getTotalMoneySpent() {
                return totalMoneySpent;
        }

        //adds the total spent by the schools
        public static void updateTotalMoneySpent(int moneySpent) {
                totalMoneyEarned-=moneySpent;
                totalMoneySpent+=moneySpent;
        }

        @Override
        public String toString() {
                return  "School's total income : " + totalMoneyEarned + "\n" +students + "\n" + teachers;
        }
}
