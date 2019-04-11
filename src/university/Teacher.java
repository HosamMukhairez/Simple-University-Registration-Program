/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

import java.util.Scanner;

/**
 *
 * @author eng
 */
public class Teacher extends Person {

    private String collage[] = new String[50];
    private Course[] courses = new Course[4];
    int salary[] = new int[50];
    int totalCourses[] = new int[50];
    int age = 0;
    private int taken;
    double grades = 0;
    int index = 0;

    public Teacher() {
        super();
        courses = new Course[50];
    }

    public void setCourses(int i, Course newCourses) {
        courses[i] = newCourses;
        totalCourses[i] = 0;
    }

    public String getCourses() {
        String coursesList = "";
        for (int x = 0; x < index; x++) {
            //coursesList = courses[x].getAllCourses() + " ";
            System.out.println("courses[x].totalCourses:" + courses[x].total);
            for (int y = 0; y < courses[x].total; y++) {
                coursesList = courses[x].getCourse(y) + " ";
            }
        }
        return coursesList;
    }

    public String getCollage(int i) {
        return collage[i];
    }

    public void setcollage(String newcollage, int i) {
        collage[i] = newcollage;
    }

    public void setSalary(int s, int i) {
        salary[i] = s;
    }

    public int getSalary(int i) {
        return salary[i];
    }

    public void getAllTeachers() {
        int i = 0;
        while (i < index) {
            System.out.println("#." + (i + 1));
            System.out.println("Teacher Name:" + getName(i));
            System.out.println("Teacher Collage:" + getCollage(i));
            System.out.println("Teacher Salary:" + getSalary(i));
            System.out.println("Teacher address:" + getAddress(i));
            System.out.println("Teacher gender:" + getGender(i));
            System.out.println("Teacher mobile:" + getMobile(i));
            System.out.println("Teacher date of birth:" + getDOB(i));
            System.out.println("Teacher SSN:" + getSSN(i));
            System.out.println("Teacher Salary:" + getSalary(i));
            System.out.println("Teacher Courses:" + getCourses() + "\n");
            i++;
        }
    }

    public void LoadFromConsole() {
        try {
            Scanner input = new Scanner(System.in);
            Course c = new Course();

            System.out.printf("Please enter teacher's name: ");
            String a = input.nextLine();
            setName(a, index);

            System.out.printf("Please enter teacher's address: ");
            String b = input.nextLine();
            setAddress(b, index);

            System.out.printf("Please enter teacher's gender: ");
            String g = input.nextLine();
            setGender(g, index);

            System.out.printf("Please enter teacher's mobile#: ");
            int m = Integer.parseInt(input.nextLine());
            setMobile(m, index);

            System.out.printf("Please enter teacher's date of birth: ");
            String dob = input.nextLine();
            setDOB(dob, index);

            System.out.printf("Please enter teacher's SSN: ");
            int s = Integer.parseInt(input.nextLine());
            setSSN(s, index);

            System.out.printf("Please enter teacher's collage: ");
            String j = input.nextLine();
            setcollage(j, index);

            System.out.printf("Please enter teacher's salary: ");
            int sal = Integer.parseInt(input.nextLine());
            setSalary(sal, index);

            System.out.printf("Please enter the number of courses for teachering: ");
            taken = input.nextInt();
            for (int x = 0; x < taken; x++) {
                System.out.printf("Please enter course name: ");
                String cn = input.next();
                c.setCourse(cn, x);

                System.out.printf("Please enter credits: ");
                int f = input.nextInt();
                c.setCredits(f, x);

                c.setGrade(0, x);

                setCourses(x, c);
            }
            index++;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
