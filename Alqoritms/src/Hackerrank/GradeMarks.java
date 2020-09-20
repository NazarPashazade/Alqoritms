package Hackerrank;

import java.util.ArrayList;
import java.util.List;

/*
Output   [80, 96, 18, 73, 78, 60, 60, 15, 45, 15, 10, 5, 46, 87, 33, 60, 14, 71]
Input    [80, 96, 18, 75, 80, 60, 60, 15, 45, 15, 10, 5, 46, 87, 33, 60, 14, 71]
 

75-73=2<3        boyuk 75
70-67=3=3        kicik 67
40-38=2<3        boyuk 40
33 < 38          ozu   33

 */


public class GradeMarks {

    public static void main(String[] args) {
        List<Integer> oldlList = new ArrayList<Integer>();
        oldlList.add(80);
        oldlList.add(96);
        oldlList.add(18);
        oldlList.add(73);
        oldlList.add(78);
        oldlList.add(60);
        oldlList.add(60);
        oldlList.add(15);
        oldlList.add(45);
        oldlList.add(15);
        oldlList.add(10);
        oldlList.add(5);
        oldlList.add(46);
        oldlList.add(87);
        oldlList.add(33);
        oldlList.add(60);
        oldlList.add(14);
        oldlList.add(71);
        System.out.println(oldlList);

        System.out.println("\n\n\n");
        System.out.println(gradingStudents(oldlList));

    }

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> newList = new ArrayList<Integer>();

        int ferq = 0;

        for (int i = 0; i < grades.size(); i++) {

            /// 1ci sert
            if (grades.get(i) < 38) {
                newList.add(grades.get(i));
            }
            /// 2ci sert
            if (grades.get(i) == 38 || grades.get(i) == 39) {
                newList.add(40);
            }

            ////hansi araliga dail olmasinin tapilmasi ucun dovr
            int j = 40;
            while (j <= 100) {

                ////Eger 45 ile 50 arasina duserse ferqin tapilmasi
                if (grades.get(i) < j + 5 && grades.get(i) > j) {

                    ferq = (j + 5) - grades.get(i);   // 50-47= 3

                    if (ferq == 3) {
                        newList.add(grades.get(i));
                    }

                    if (ferq > 3) {
                        newList.add(grades.get(i));
                    }
                    if (ferq < 3) {
                        newList.add(j + 5);
                    }

                } else if (grades.get(i) == j) {
                    newList.add(grades.get(i));
                }

                j = j + 5;  //45
            }//while

        }//for

        return newList;
    }

}
