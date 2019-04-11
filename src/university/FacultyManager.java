/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

import java.util.Scanner;

/**
 *
 * @author Hosam
 */
public class FacultyManager extends Person {

    String name = "", manager = "";
    String allFacultyName[] = new String[50];
    String allFacultyManager[] = new String[50];
    int index = 0;

    public FacultyManager() {
    }

    public void setFacultyName(String n, int i) {
        allFacultyName[i] = n;
    }

    public String getFacultyName(int i) {
        return allFacultyName[i];
    }

    public void setFacultyManager(String m, int i) {
        allFacultyManager[i] = m;
    }

    public String getFacultyManager(int i) {
        return allFacultyManager[i];
    }

    public void getAllFaculties() {
        int i = 0;
        while (i < index) {
            System.out.println("#." + (i + 1));
            System.out.println("Faculty Name:" + getFacultyName(i));
            System.out.println("Faculty Manager:" + getFacultyManager(i));
            System.out.println("Faculty Manager's address:" + getAddress(i));
            System.out.println("Faculty Manager's gender:" + getGender(i));
            System.out.println("Faculty Manager's mobile:" + getMobile(i));
            System.out.println("Faculty Manager's date of birth:" + getDOB(i));
            System.out.println("Faculty Manager's SSN:" + getSSN(i) + "\n");
            i++;
        }
    }

    public void LoadFromConsole() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.printf("Please enter faculty name: ");
            String n = input.nextLine();
            setFacultyName(n, index);

            System.out.printf("Please enter faculty manager name: ");
            String m = input.nextLine();
            setFacultyManager(m, index);

            System.out.printf("Please enter manager's address: ");
            String b = input.nextLine();
            setAddress(b, index);

            System.out.printf("Please enter manager's gender: ");
            String g = input.nextLine();
            setGender(g, index);

            System.out.printf("Please enter manager's mobile#: ");
            int mob = Integer.parseInt(input.nextLine());
            setMobile(mob, index);

            System.out.printf("Please enter manager's date of birth: ");
            String dob = input.nextLine();
            setDOB(dob, index);

            System.out.printf("Please enter manager's SSN: ");
            int s = Integer.parseInt(input.nextLine());
            setSSN(s, index);
            index++;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
