package generics;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Student s = new Student();
        s.spendiya = "eddc";
        s.spendiya = 55;
        s.spendiya = 55.55;

        Employer<Double> e = new Employer();
//        e.salary="dddd";
//        e.salary=55;
        e.salary = 55.5;

    }

}
