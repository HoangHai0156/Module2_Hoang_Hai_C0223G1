package model;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    private boolean isAscending;
    public StudentComparator(boolean isAscending){
        this.isAscending = isAscending;
    }


    @Override
    public int compare(Student o1, Student o2) {
        if (isAscending){
            return Double.compare(o1.getAverageScore(),o2.getAverageScore());
        }else return Double.compare(o2.getAverageScore(),o1.getAverageScore());
    }
}
