package OOP.lab23jan;

import java.util.ArrayList;

/**
 * Semester
 */
public class Semester {

    private String semester_id = "";
    private ArrayList<Course> courses = new ArrayList<Course>();
    private Double sem_gpa = 0.0;

    public Semester(String id, ArrayList<Course> cou) {
        this.courses = cou;
        this.semester_id = id;
    }

    public void cal_gpa() {
        Double total_credit = 0.0;
        Double total_grade = 0.0;

        for (int i = 0; i < courses.size(); i++) {
            total_credit = total_credit + courses.get(i).getCou_credit();
            if (courses.get(i).getCou_grade() == "A") {
                total_grade = total_grade + (courses.get(i).getCou_credit() * 4);
            } else if (courses.get(i).getCou_grade() == "B+") {
                total_grade = total_grade + (courses.get(i).getCou_credit() * 3.5);
            } else if (courses.get(i).getCou_grade() == "B") {
                total_grade = total_grade + (courses.get(i).getCou_credit() * 3);
            } else if (courses.get(i).getCou_grade() == "C+") {
                total_grade = total_grade + (courses.get(i).getCou_credit() * 2.5);
            } else if (courses.get(i).getCou_grade() == "C") {
                total_grade = total_grade + (courses.get(i).getCou_credit() * 2);
            } else if (courses.get(i).getCou_grade() == "D+") {
                total_grade = total_grade + (courses.get(i).getCou_credit() * 1.5);
            } else if (courses.get(i).getCou_grade() == "D") {
                total_grade = total_grade + (courses.get(i).getCou_credit() * 1);
            } else {
                total_grade = total_grade + (courses.get(i).getCou_credit() * 0);
            }
        }

        this.sem_gpa = total_grade / total_credit;
    }

    public String getSemester_id() {
        return semester_id;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public Double getSem_gpa() {
        return sem_gpa;
    }

}