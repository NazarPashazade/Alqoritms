package Hackerrank.DataStructur;

import java.util.List;
import java.util.ArrayList;

public class EqualStacks___EASY {

    public static void main(String[] args) {
        int h1[] = {3, 2, 1, 1, 1};
        int h2[] = {4, 3, 2};
        int h3[] = {1, 1, 4, 1};

        System.out.println(equalStacks(h1, h2, h3));
    }

    static int equalStacks(int[] h1, int[] h2, int[] h3) {

        List<Integer> t1 = new ArrayList<Integer>();
        List<Integer> t2 = new ArrayList<Integer>();
        List<Integer> t3 = new ArrayList<Integer>();

        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();

        Integer n1 = 0;
        Integer n2 = 0;
        Integer n3 = 0;

        Integer m1 = 0;
        Integer m2 = 0;
        Integer m3 = 0;

        for (int i = 0; i < h1.length; i++) {
            m1 += h1[i];
            t1.add(h1[i]);
        }
        for (int i = 0; i < h2.length; i++) {
            m2 += h2[i];
            t2.add(h2[i]);
        }
        for (int i = 0; i < h3.length; i++) {
            m3 += h3[i];
            t3.add(h3[i]);
        }
//        System.out.println("******************");
//        System.out.println("list1 = " + t1);
//        System.out.println("list2 = " + t2);
//        System.out.println("list3 = " + t3);
//        System.out.println("*******************");
//        
//        
//        
//    
//
//       
        if (m1 == m2 && m2 == m3) {
            return m1;
        }
//        
//        
//        
//    
//
// 
        List<Integer> minList = new ArrayList<Integer>();
        int min = 0;
        if (m1 < m2 && m1 < m3) {
            minList.addAll(t1);
            min = m1;
        } else if (m2 < m1 && m2 < m3) {
            minList.addAll(t2);
            min = m2;
        } else if (m3 < m1 && m3 < m2) {
            minList.addAll(t3);
            min = m3;
        }

//        
//        
//        
//    
//
//
        boolean isSucces = false;
        boolean list1_Okey = false;
        boolean list2_Okey = false;
        boolean list3_Okey = false;

        for (int k = 0; k < minList.size(); k++) {
            list1.clear();
            list2.clear();
            list3.clear();
            list1.addAll(t1);
            list2.addAll(t2);
            list3.addAll(t3);
            n1 = m1;
            n2 = m2;
            n3 = m3;
            min -= minList.get(k);

//            System.out.println("min = " + min);
            list1_Okey = false;
            if (n1 == min) {
                list1_Okey = true;
//                System.out.println("lis1-de odendi");
            } else {
                for (int i = 0; i < list1.size(); i++) {
                    n1 -= list1.get(i);
                    if (n1 == min) {
//                        System.out.println("lis1-de odendi");
                        list1_Okey = true;
                        break;
                    }
                }
            }

            list2_Okey = false;
            if (n2 == min) {
                list2_Okey = true;
//                System.out.println("lis2-de odendi");
            } else {
                for (int i = 0; i < list2.size(); i++) {
                    n2 -= list2.get(i);

                    if (n2 == min) {
//                        System.out.println("lis2-de odendi");
                        list2_Okey = true;
                        break;
                    }

                }
            }

            list3_Okey = false;
            if (n3 == min) {
                list3_Okey = true;
//                System.out.println("lis3-de odendi");
            } else {
                for (int i = 0; i < list3.size(); i++) {
                    n3 -= list3.get(i);
                    if (n3 == min) {
//                        System.out.println("lis3-de odendi");
                        list3_Okey = true;
                        break;
                    }
                }
            }
//            System.out.println(k);
//            System.out.println("\n");
            isSucces = false;
            if (list1_Okey && list2_Okey && list3_Okey) {
                return min;
            }
        }

        return 0;
    }

}
