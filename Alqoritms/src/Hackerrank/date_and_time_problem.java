package Hackerrank;

import java.time.*;

public class date_and_time_problem {

    public static void main(String[] args) {
        System.out.println(findDay(1, 22, 2020));
    }

    public static String findDay(int month, int day, int year) {

        LocalDate date = LocalDate.of(year, month, day);

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        return "" + dayOfWeek;
    }

}
