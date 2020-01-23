package OOP.lab23jan;

import java.util.ArrayList;

/**
 * Student
 */
public class Student {

    private String student_id;
    private ArrayList<Semester> enrolls = new ArrayList<Semester>();

    public Student(String id) {
        this.student_id = id;
    }

    public void set_semester() {

        ArrayList<Course> cou1_59 = new ArrayList<Course>();
        // Semester 1
        Course eng1 = new Course("001101", "FUNDAMENTAL ENGLISH 1", 3.00, "B");
        Course cal = new Course("206113", "CAL FOR SOFTWARE ENGINEERING", 3.00, "B+");
        Course eco = new Course("751100", "ECONOMICS FOR EVERYDAY LIFE", 3.00, "D+");
        Course ani100 = new Course("951100", "MODERN LIFE AND ANIMATION", 3.00, "A");
        Course logical = new Course("953103", "PROGRAMMING LOGICAL THINKING", 2.00, "A");
        Course com_or = new Course("953211", "COMPUTER ORGANIZATION", 3.00, "C+");
        cou1_59.add(eng1);
        cou1_59.add(cal);
        cou1_59.add(eco);
        cou1_59.add(ani100);
        cou1_59.add(logical);
        cou1_59.add(com_or);

        ArrayList<Course> cou2_59 = new ArrayList<Course>();
        // Semester 1
        Course eng2 = new Course("001102", "FUNDAMENTAL ENGLISH 2 ", 3.00, "B");
        Course logic = new Course("011251", "LOGIC", 3.00, "B");
        Course adt = new Course("953102", "ADT & PROBLEM SOLVING ", 3.00, "C+");
        Course webui = new Course("953104", "WEB UI DESIGN & DEVELOP", 3.00, "C");
        Course introse = new Course("953202", "INTRODUCTION TO SE", 3.00, "C");
        Course oop = new Course("953231", "OBJECT ORIENTED PROGRAMMING", 3.00, "B");
        Course act1 = new Course("955100", "LEARNING THROUGH ACTIVITIES 1", 1.00, "A");
        cou2_59.add(eng2);
        cou2_59.add(logic);
        cou2_59.add(adt);
        cou2_59.add(webui);
        cou2_59.add(introse);
        cou2_59.add(oop);
        cou2_59.add(act1);

        Semester sem1 = new Semester("1/2559", cou1_59);
        Semester sem2 = new Semester("2/2559", cou2_59);

        this.enrolls.add(sem1);
        this.enrolls.add(sem2);
    }

    public void get_transcript() {
        for (int s = 0; s < enrolls.size(); s++) {
            System.out.println("---------" + enrolls.get(s).getSemester_id() + "---------");
            enrolls.get(s).cal_gpa();
            for (int c = 0; c < enrolls.get(s).getCourses().size(); c++) {

                String cou_id = enrolls.get(s).getCourses().get(c).getCou_id();
                String cou_name = enrolls.get(s).getCourses().get(c).getCou_name();
                Double cou_credit = enrolls.get(s).getCourses().get(c).getCou_credit();
                String cou_grade = enrolls.get(s).getCourses().get(c).getCou_grade();
                System.out.println(cou_id + " " + cou_name + " " + cou_credit + " " + cou_grade);
            }
            System.out.println("--- GPA: " + enrolls.get(s).getSem_gpa() + "---");
        }
    }

}