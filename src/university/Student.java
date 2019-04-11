/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

import java.util.Scanner;
import java.io.PrintStream;

class Student extends Person {

    private String collage[] = new String[50];
    private int taken[] = new int[50], credit[] = new int[50];
    private Course[][] courses = new Course[50][50];
    double grades[] = new double[50];
    String stdCollage[] = new String[50];
    int index = 0;

    public Student() {
        courses = new Course[50][50];
    }

    public void setCourses(int i, Course newCourses, int x) {
        courses[x][i] = newCourses;
    }

    public String getCourses(int x, int i) {
        return courses[x][i].getCourse(i);
    }

    public String getcollage(int i) {
        return collage[i];
    }

    public void setcollage(String newcollage, int i) {
        collage[i] = newcollage;
    }

    public int getTaken(int i) {
        return taken[i];
    }

    public void setTaken(int newTaken, int i) {
        taken[i] = newTaken;
    }

    public void LoadFromConsole() {
        try {
            Scanner input = new Scanner(System.in);

            Course c = new Course();

            System.out.printf("Please enter student's name: ");
            String a = input.nextLine();
            setName(a, index);

            System.out.printf("Please enter student's address: ");
            String b = input.nextLine();
            setAddress(b, index);

            System.out.printf("Please enter student's gender: ");
            String g = input.nextLine();
            setGender(g, index);

            System.out.printf("Please enter student's mobile#: ");
            int m = Integer.parseInt(input.nextLine());
            setMobile(m, index);

            System.out.printf("Please enter student's date of birth: ");
            String dob = input.nextLine();
            setDOB(dob, index);

            System.out.printf("Please enter student's SSN: ");
            int s = Integer.parseInt(input.nextLine());
            setSSN(s, index);

            System.out.printf("Please enter student's collage: ");
            String j = input.nextLine();
            setcollage(j, index);

            System.out.printf("Please enter the number of courses taken: ");
            taken[index] = input.nextInt();
            int cr = 0;
            double gra = 0;
            for (int x = 0; x < taken[index]; x++) {
                System.out.printf("Please enter course name: ");
                String cn = input.next();
                c.setCourse(cn, x);

                System.out.printf("Please enter credits: ");
                int f = input.nextInt();
                cr += f;
                c.setCredits(f, x);

                System.out.printf("Please enter course grade: ");
                double gr = input.nextDouble();
                gra += gr;
                c.setGrade(gr, x);

                setCourses(x, c, index);
            }
            credit[index] = cr;
            grades[index] = gra;
            index++;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void GradeReport() {
        int i = 0;
        while (i < index) {
            System.out.println("#." + (i + 1));
            System.out.println("Student Name:" + getName(i));
            System.out.println("Student Collage:" + getcollage(i));
            System.out.println("Student address:" + getAddress(i));
            System.out.println("Student gender:" + getGender(i));
            System.out.println("Student mobile:" + getMobile(i));
            System.out.println("Student date of birth:" + getDOB(i));
            System.out.println("Student SSN:" + getSSN(i));
            System.out.println("Student courses list:");
            System.out.printf("Course | Credits | Grade\n");
            for (int x = 0; x < taken[i]; x++) {
                System.out.println(courses[i][x].getCourse(x) + " | " + courses[i][x].getCredits(x) + "       | " + courses[i][x].getGrade(x));
            }
            System.out.printf("-------------------------------\n");
            System.out.println("Total Credits " + credit[i]);
            System.out.println("Avg(numeric)  " + (grades[i] / (taken[i] * 100)) * 100 + "%" + "\n");
            i++;
        }
    }
}
