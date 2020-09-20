package Hackerrank;

import java.math.BigInteger;

/*
    Dovrlerin sayi cox olanda proses uzun cekdiyi ucun 
    dovrlerin sayini/9 bolub tapdigim eded qeder setirleri tekrarlayib
    yekunda alinnan setri 9 defe yeniden tekrarlayiram

input  :
            aba
            10

output :
            7

yeni, aba setrini zununlugu 10 olana qeder ardicil yaziriq : abaabaabaa   ve bu setirde 7 dene a var
 */
public class InfinitiveStr {

    public static void main(String[] args) {

        //////CASE 0               7
//        String s = "aba";
//        long n = 10;
        //////CASE 1                1000000000000
//        String s = "a";
//        long n = 1000000000000L;
        //////CASE 2                 588525
//        String s = "aab";
//        long n = 882787;
        //////CASE 3                  0
        String s = "ceebbcb";
        long n = 817723;

        //////CASE 8                      69801196944
//        String s = "udjlitpopjhipmwgvggazhuzvcmzhulowmveqyktlakdufzcefrxufssqdslyfuiahtzjjdeaxqeiarcjpponoclynbtraaawrps";
//        long n = 872514961806L;
        System.out.println("s = " + s);
        System.out.println("n = " + n);
        System.out.println("---------------------------------------------");

        System.out.println("netice          =" + repeatedString(s, n));

    }

    static long repeatedString(String s, long n) {

        int herfSayi = s.length();

        long dovrSayi = (long) (n / herfSayi);

        int sozde_a_Sayi = 0;

        for (int j = 0; j < herfSayi; j++) {
            if (s.charAt(j) == 'a') {
                sozde_a_Sayi++;
            }
        }

        long setirUzunlugu = (long) (dovrSayi * herfSayi);   /// eksik

        long yeniCumledeASayi = (long) (dovrSayi * sozde_a_Sayi);

        long catismayanHerfSayi = (long) (n - setirUzunlugu);

        long catismayan_a_sayi = 0;
        for (int j = 0; j < catismayanHerfSayi; j++) {
            if (s.charAt(j) == 'a') {
                catismayan_a_sayi++;
            }
        }

        System.out.println("herfSayi =" + herfSayi);
        System.out.println("aSayi =" + sozde_a_Sayi);
        System.out.println("dovrSayi =" + dovrSayi);
        System.out.println("setirUzunlugu =" + setirUzunlugu);

        System.out.println("yeniCumledeASayi =" + yeniCumledeASayi);
        System.out.println("catismayan_a_sayi =" + catismayan_a_sayi);
        System.out.println("catismayanHerfSayi =" + catismayanHerfSayi);

        return yeniCumledeASayi + catismayan_a_sayi;
    }

}
