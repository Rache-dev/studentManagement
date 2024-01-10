package studentManagement;

import java.util.*;
public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses =null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int yearEnrolled = 18;
    private static int id = 1000;
    //constructor: prompts student to enter name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        this.firstName = in.nextLine();
        System.out.print("Enter your last name: ");
        this.lastName = in.nextLine();
        System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter  your grade level: ");
        this.gradeYear = in.nextInt();

        setStudentId();
    }
    //generate an ID
    private void setStudentId(){
        //yearEnrolled + id
        id++;
        yearEnrolled++;
        this.studentID = yearEnrolled +"/" + id;
    }
    //enroll in courses
    public void enroll(){
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses +"\n " + course;
                tuitionBalance += costOfCourse;
            } else {break;}
        }while (1 != 0);
    }
    //View balance
    public void viewBalance(){
        System.out.println("Your balance is: $"+tuitionBalance);
    }
    //pay tuition
    public void payTuition(){
        viewBalance();
        Scanner in = new Scanner(System.in);
        System.out.print("How much would you like to pay for tuition: $");
        int payment = in.nextInt();
        tuitionBalance -= payment;
    }
    //show status of student
    public String showInfo(){
        return "Name: " + firstName +" "+lastName+
                "\nGrade Level: "+gradeYear+
                "\nStudent ID: "+studentID+
                "\nCourses enrolled: " +courses+
                "\nBalance: "+tuitionBalance;
    }

}
