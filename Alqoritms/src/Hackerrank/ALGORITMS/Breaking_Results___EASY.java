package Hackerrank.ALGORITMS;

import java.util.HashSet;
import java.util.Set;

public class Breaking_Results___EASY {

    public static void main(String[] args) {
        ////   CASE - 0       ANSWER  4 0
//        int arr[] = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
//
//
        ////   CASE - 1       ANSWER  2 4
//        int arr[] = {10, 5, 20, 20, 4, 5, 2, 25, 1};
//
//
        ////   CASE - 2       ANSWER  5 1
        int arr[] = {17, 45, 41, 60, 17, 41, 76, 43, 51, 40, 89, 92, 34, 6, 64, 7, 37, 81, 32, 50};

        int results[] = breakingRecords(arr);

        System.out.println(results[0] + "  " + results[1]);
    }

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int counters[] = new int[2];

        int scoreHige[] = new int[scores.length];
        int scoreLow[] = new int[scores.length];

        Set<Integer> setHigh = new HashSet<Integer>();
        Set<Integer> setLow = new HashSet<Integer>();

        for (int i = 0; i < scores.length; i++) {
//            System.out.print(scores[i] + " ");
            scoreHige[i] = scores[i];
            scoreLow[i] = scores[i];
        }

        for (int i = 0; i < scoreHige.length - 1; i++) {
            if (scoreHige[i] > scoreHige[i + 1]) {
                scoreHige[i + 1] = scoreHige[i];
            }
        }
        for (int i = 0; i < scoreLow.length - 1; i++) {
            if (scoreLow[i] < scoreLow[i + 1]) {
                scoreLow[i + 1] = scoreLow[i];
            }
        }

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] == scoreHige[i] && scoreHige[0] != scoreHige[i]) {
                setHigh.add(scores[i]);
            }
            if (scores[i] == scoreLow[i] && scoreLow[0] != scoreLow[i]) {
                setLow.add(scores[i]);
            }
        }

        counters[0] = setHigh.size();
        counters[1] = setLow.size();

//        System.out.println("");
//        System.out.println("scoreLow");
//        for (int i = 0; i < scoreLow.length; i++) {
//            System.out.print(scoreLow[i] + " ");
//        }
//        System.out.println("");
//
//        System.out.println("scoreHige");
//        for (int i = 0; i < scoreHige.length; i++) {
//            System.out.print(scoreHige[i] + " ");
//        }
//        System.out.println("");
        return counters;
    }

}
