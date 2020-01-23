package OOP.lab23jan;

/**
 * Course
 */
public class Course {

    private String cou_id;
    private String cou_name;
    private Double cou_credit;
    private String cou_grade;

    public Course(String id, String name, Double credit, String grade) {
        this.cou_id = id;
        this.cou_credit = credit;
        this.cou_grade = grade;
        this.cou_name = name;
    }

    public String getCou_id() {
        return cou_id;
    }

    public String getCou_name() {
        return cou_name;
    }

    public Double getCou_credit() {
        return cou_credit;
    }

    public String getCou_grade() {
        return cou_grade;
    }

}