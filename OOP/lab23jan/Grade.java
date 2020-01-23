package OOP.lab23jan;

import java.util.ArrayList;

class Grade {

    public Double calculate_grade(ArrayList<String> set_grade, ArrayList<Double> set_credit) {
        Double total_credit = 0.0;
        Double total_grade = 0.0;

        for (int i = 0; i < set_grade.size(); i++) {
            total_credit = total_credit + set_credit.get(i);
            if (set_grade.get(i) == "A") {
                total_grade = total_grade + (set_credit.get(i) * 4);
            } else if (set_grade.get(i) == "B+") {
                total_grade = total_grade + (set_credit.get(i) * 3.5);
            } else if (set_grade.get(i) == "B") {
                total_grade = total_grade + (set_credit.get(i) * 3);
            } else if (set_grade.get(i) == "C+") {
                total_grade = total_grade + (set_credit.get(i) * 2.5);
            } else if (set_grade.get(i) == "C") {
                total_grade = total_grade + (set_credit.get(i) * 2);
            } else if (set_grade.get(i) == "D+") {
                total_grade = total_grade + (set_credit.get(i) * 1.5);
            } else if (set_grade.get(i) == "D") {
                total_grade = total_grade + (set_credit.get(i) * 1);
            } else {
                total_grade = total_grade + (set_credit.get(i) * 0);
            }
        }

        return total_grade / total_credit;
    }

}