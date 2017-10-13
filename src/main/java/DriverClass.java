import studentregistry.CourseProgramme;
import studentregistry.Module;
import studentregistry.Student;

import java.util.ArrayList;
import java.util.List;

public class DriverClass {

    public static void main(String[] args) {

        Student s1, s2, s3, s4, s5, s6, s7, s8;
        Module m1, m2, m3, m4;
        CourseProgramme c1, c2;

        s1 = new Student("Carl", "21/07/1996", 12345);
        s2 = new Student("Ruairi", "19/05/1994", 17594);
        s3 = new Student("Steve", "06/11/1995", 12948);
        s4 = new Student("Kealan", "24/12/1990", 15304);
        s5 = new Student("Donnchadh", "13/09/1994", 15924);
        s6 = new Student("Liam", "18/07/1995", 14772);
        s7 = new Student("Richard", "02/03/1995", 19643);
        s8 = new Student("Eoghan", "16/06/1995", 10429);

        List<Student> mod1 = new ArrayList<Student>();
        mod1.add(s1); mod1.add(s2); mod1.add(s3); mod1.add(s4);
        mod1.add(s5); mod1.add(s6); mod1.add(s7); mod1.add(s8);

        List<Student> mod2 = new ArrayList<Student>();
        mod2.add(s1); mod2.add(s2); mod2.add(s3); mod2.add(s4);
        mod2.add(s5); mod2.add(s6); mod2.add(s7); mod2.add(s8);

        List<Student> mod3 = new ArrayList<Student>();
        mod3.add(s6); mod3.add(s7); mod3.add(s8);

        List<Student> mod4 = new ArrayList<Student>();
        mod4.add(s1); mod4.add(s2); mod4.add(s3); mod4.add(s4); mod4.add(s5);

        m1 = new Module("Programming","CT145", mod1);
        m2 = new Module("Telecommunications", "EE243", mod2);
        m3 = new Module("Machine Learning", "CT475", mod3);
        m4 = new Module("System on Chip", "EE285", mod4);

        List<Module> ECE = new ArrayList<Module>();
        ECE.add(m1); ECE.add(m2); ECE.add(m4);

        List<Module> CSIT = new ArrayList<Module>();
        CSIT.add(m1); CSIT.add(m2); CSIT.add(m3);

        c1 = new CourseProgramme("ECE", ECE, "04/09/2017", "18/05/2018");
        c2 = new CourseProgramme("CSIT", CSIT, "04/09/2017", "18/05/2018");

        List<CourseProgramme> courses = new ArrayList<CourseProgramme>();
        courses.add(c1); courses.add(c2);

        System.out.println("Running test...");

        for (CourseProgramme c : courses) {

            for (Student s : c.getStudents()) {

                System.out.println("Name  :   " + s.getName());
                System.out.print("Modules  :   ");
                for (Module m : s.getModules()) {
                    System.out.print(m.getName() + " | ");
                }
                System.out.println("\nCourse  :   " + s.getCourse().getName() + "\n");
            }
        }
    }

}


