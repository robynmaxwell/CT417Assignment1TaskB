package org.example;
import org.joda.time.DateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        Student s1 = new Student("Robyn", 22, 1, DateTime.parse("2000-06-01T00:00:00.000Z"));
        Student s2 = new Student("Hannah", 21, 2, DateTime.parse("2001-03-02T00:00:00.000Z"));
        Student s3 = new Student("Shona", 22, 3, DateTime.parse("2001-03-02T00:00:00.000Z"));
        Student s4 = new Student("Martha", 24, 4, DateTime.parse("2001-03-02T00:00:00.000Z"));
        Student s5 = new Student("Mia", 18, 5, DateTime.parse("2001-03-02T00:00:00.000Z"));
        Student s6 = new Student("Niamh", 19, 6, DateTime.parse("2001-03-02T00:00:00.000Z"));

        Programme p1 = new Programme("Electronic and Computer Engineering", DateTime.parse("2000-06-01T00:00:00.000Z"), DateTime.parse("2000-06-01T00:00:00.000Z"));
        Programme p2 = new Programme("Mechanical Engineering", DateTime.parse("2000-06-01T00:00:00.000Z"), DateTime.parse("2000-06-01T00:00:00.000Z"));
        Programme p3 = new Programme("Biomedical Engineering", DateTime.parse("2000-06-01T00:00:00.000Z"), DateTime.parse("2000-06-01T00:00:00.000Z"));

        Lecturer l1 = new Lecturer("James", 55, 1,DateTime.parse("2001-01-01T00:00:00.000Z"));
        Lecturer l2 = new Lecturer("John", 57, 2,DateTime.parse("2001-01-01T00:00:00.000Z"));
        Lecturer l3 = new Lecturer("Una", 45, 3,DateTime.parse("2001-01-01T00:00:00.000Z"));
        Lecturer l4 = new Lecturer("Lucy", 65, 4,DateTime.parse("2001-01-01T00:00:00.000Z"));

        Modules m1= new Modules("Software Engineering", "CT417");
        Modules m2= new Modules("Embedded Systems", "CT223");
        Modules m3= new Modules("Human Biology", "BE467");
        Modules m4= new Modules("Thermodynamics" , "TY676");
        Modules m5= new Modules("Power Systems", "BE678");
        Modules m6= new Modules("CAD" , "ME783");

        ArrayList<Student> allStudents = new ArrayList<>();
        allStudents.add(s1);
        allStudents.add(s2);
        allStudents.add(s3);
        allStudents.add(s4);
        allStudents.add(s5);
        allStudents.add(s6);

        // List of courses
        ArrayList<Programme> courses= new ArrayList<Programme>();
        courses.add(p1);
        courses.add(p2);
        courses.add(p3);

        // Add modules to lists
        ArrayList<Modules> eceModules= new ArrayList<Modules>();
        eceModules.add(m1);
        eceModules.add(m2);

        ArrayList<Modules> bioModules= new ArrayList<Modules>();
        bioModules.add(m3);
        bioModules.add(m4);

        ArrayList<Modules> mechModules= new ArrayList<Modules>();
        mechModules.add(m5);
        mechModules.add(m6);

        s1.setModuleList(eceModules);
        s2.setModuleList(mechModules);
        s3.setModuleList(bioModules);
        s4.setModuleList(eceModules);
        s5.setModuleList(mechModules);
        s6.setModuleList(bioModules);

        ArrayList<Student> sListA= new ArrayList<Student>();
        sListA.add(s1);
        sListA.add(s4);

        ArrayList<Student> sListB= new ArrayList<Student>();
        sListB.add(s2);
        sListB.add(s5);

        ArrayList<Student> sListC= new ArrayList<Student>();
        sListB.add(s3);
        sListB.add(s6);

        p1.setModuleList(eceModules);
        p2.setModuleList(bioModules);
        p3.setModuleList(mechModules);

        p1.setStudentList(sListA);
        p2.setStudentList(sListB);
        p3.setStudentList(sListC);

        s1.setCourses(p1);
        s2.setCourses(p2);
        s3.setCourses(p3);
        s4.setCourses(p1);
        s5.setCourses(p2);
        s6.setCourses(p3);

        m1.setStudentList(sListA);
        m2.setStudentList(sListB);
        m3.setStudentList(sListC);
        m4.setStudentList(sListA);
        m5.setStudentList(sListB);
        m6.setStudentList(sListC);



        // Print list of course 1, respective modules, all students registered usernames and assigned modules
        for(Programme p: courses) {
            System.out.println("\nCourse Name: " + p.getCourseName());
            System.out.println("-------------------------------------------------");
            System.out.println("Modules: ");
            for (Modules m : p.getModuleList()) {
                System.out.println( "  - "+m.getModName());
                /*System.out.println("Students: " );
                //for (Student s: m.getStudentList()){
                 //   System.out.println(s.getsUsername());
                //}*/

            }

        }
        System.out.println("\n\n-----------------------------------------");
        System.out.println("Students");
        System.out.println("-----------------------------------------");

        for(Student s: allStudents){

            System.out.println("\nStudent Name: " +s.getsName());
            System.out.println("Username: "+s.getsUsername());
            System.out.println("Modules: ");

            for(Modules mod: s.getModuleList()){
                System.out.println("  - "+mod.getModName());
            }
            System.out.println("Courses: "+ s.getCourses().getCourseName());




        }

    }
}