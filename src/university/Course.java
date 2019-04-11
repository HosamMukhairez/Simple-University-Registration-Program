/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

import java.util.Scanner;

class Course {

    private String course[] = new String[50];
    private int credits[] = new int[50];
    private double grade[] = new double[50];
    double totalGrades = 0;
    int total = 0;
    int index = 0;

    public Course() {
    }

    public String getCourse(int i) {
        return course[i];
    }

    public String getAllCourses() {
        String courses = "";
        for (int x = 0; x < index; x++) {
            courses = "#." + (x + 1) + " " + getCourse(x) + "(" + getCredits(x) + ")" + " ";
            System.out.println(courses);
        }
        return courses;
    }

    public void setCourse(String newCourse, int i) {
        course[i] = newCourse;
    }

    public int getCredits(int i) {
        return credits[i];
    }

    public void setCredits(int newCredits, int i) {
        credits[i] = newCredits;
    }

    public double getGrade(int i) {
        return grade[i];
    }

    public void setGrade(double newGrade, int i) {
        grade[i] = newGrade;
    }

    public void LoadFromConsole() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.printf("Please enter course name: ");
            String a = input.nextLine();
            setCourse(a, index);
            System.out.printf("Please enter course credits: ");
            int f = input.nextInt();
            setCredits(f, index);
            setGrade(0, index);
            index++;
            total = index;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
