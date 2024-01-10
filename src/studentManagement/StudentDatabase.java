package studentManagement;

import java.util.Scanner;

public class StudentDatabase {
    public static void main(String[] args){

        //ask how many users we want to add
        System.out.print("How many students do you want to add: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();

        //create an array of object students
        Student[] students = new Student[numOfStudents];
        //create n number of students
        for (int i = 0; i<numOfStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].showInfo());
        }

    }
}
