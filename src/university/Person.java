/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

import java.util.Scanner;

public class Person {

    protected String name[] = new String[10];
    protected String address[] = new String[10];
    String gender[] = new String[10], DOB[] = new String[10];
    int SSN[] = new int[10], mobile[] = new int[10];

    public Person() {
    }

    public String getName(int i) {
        return name[i];
    }

    public void setName(String newName, int i) {
        name[i] = newName;
    }

    public String getAddress(int i) {
        return address[i];
    }

    public void setAddress(String newAddress, int i) {
        address[i] = newAddress;
    }

    public void setGender(String g, int i) {
        gender[i] = g;
    }

    public String getGender(int i) {
        return gender[i];
    }

    public void setSSN(int s, int i) {
        SSN[i] = s;
    }

    public int getSSN(int i) {
        return SSN[i];
    }

    public void setMobile(int m, int i) {
        mobile[i] = m;
    }

    public int getMobile(int i) {
        return mobile[i];
    }

    public void setDOB(String dob, int i) {
        DOB[i] = dob;
    }

    public String getDOB(int i) {
        return DOB[i];
    }

    public static void main(String[] args) {
        int choice;
        Person p = new Person();
        Course c = new Course();
        Student s = new Student();
        Teacher t = new Teacher();
        FacultyManager f = new FacultyManager();

        do {
            System.out.println("\n");
            System.out.println("University Registration Program\n");
            System.out.println("--------------------\n");
            System.out.println("1.  Press 1 to Add Student");
            System.out.println("2.  Press 2 to Add Teacher");
            System.out.println("3.  Press 3 to Add Course");
            System.out.println("4.  Press 4 to Add Faculty Manager");
            System.out.println("5.  Press 5 to Print Student Report");
            System.out.println("6.  Press 6 to Print Teacher Report");
            System.out.println("7.  Press 7 to Print Course Report");
            System.out.println("8.  Press 8 to Print Faculty Manager Report");
            System.out.println("9.  Press 9 to End Program\n");
            System.out.printf("Enter Choice: ");

            //User input
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();

            //validation for the input            
            while ((choice < 1 || choice > 8) && choice != 9) {
                System.out.println("Please enter a 1, 2, 3, 4, 5, 6, 7, 8: ");
                choice = input.nextInt();
            }
            //switch menu for the choices
            switch (choice) {
                case 1:
                    s.LoadFromConsole();
                    break;
                case 2:
                    t.LoadFromConsole();
                    break;
                case 3:
                    c.LoadFromConsole();
                    break;
                case 4:
                    f.LoadFromConsole();
                    break;
                case 5:
                    s.GradeReport();
                    break;
                case 6:
                    t.getAllTeachers();
                    break;
                case 7:
                    c.getAllCourses();
                    break;
                case 8:
                    f.getAllFaculties();
                    break;
            }
        } //When choice is 9 ends program
        while (choice != 9);
        System.out.println("Ending program...");
    }
}
