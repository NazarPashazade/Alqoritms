/*
			

-------------------------------------Swap Minimum Array----------------------------------

            Input :   7, 1, 3, 2, 4, 5, 6
            Output :  5

7, 1, 3, 2, 4, 5, 6   
2, 1, 3, 7, 4, 5, 6   
1, 2, 3, 7, 4, 5, 6   
1, 2, 3, 4, 7, 5, 6    SWAP = 5
1, 2, 3, 4, 5, 7, 6
1, 2, 3, 4, 5, 6, 7



------------------------------------- CASE – 0 ----------------------------------
                                    
            Input :   4 3 1 2
            Output :  3





------------------------------------- CASE – 1 ----------------------------------
            Input :   2 3 4 1 5
            Output :  3

2 3 4 1 5 
2 3 1 4 5	
3 2 1 4 5    SWAP = 3  
1 2 3 4 5
	 




------------------------------------- CASE – 2 ----------------------------------
            Input :   1 3 5 2 4 6 7
            Output :  3

1 3 5 2 4 6 7
1 2 5 3 4 6 7
1 2 3 5 4 6 7    SWAP = 3
1 2 3 4 5 6 7

					


FirstNumber 	= artma ardicilligini pozan  ilk reqemden evvelki reqemi gotururuk  

SecondNumber	= oz yerinden en boyuk mesafede duran ededle yerini deyisir . 
Eger birden cox eded ozunnen eyni mesafede olarsa ozunnen sonar hemin mesafede olan ilk ededle deyisir yerin
	

 */
package Hackerrank.arrays;

import java.util.ArrayList;
import java.util.List;

public class Min_Swaps_2_MIDDLE {

    public static void main(String[] args) {
//        int arr[] = {1, 3, 5, 2, 4, 6, 7};     //CASE -2           ANSWER -3
//        int arr[] = {2, 3, 4, 1, 5};           //CASE -1           ANSWER -3
//        int arr[] = {4, 3, 1, 2};              //CASE -0           ANSWER -3
        int arr[] = {7, 1, 3, 2, 4, 5, 6};     //Default           ANSWER -5
//        int arr[] = {2, 31, 1, 38, 29, 5, 44, 6, 12, 18, 39, 9, 48, 49, 13, 11, 7, 27, 14, 33, 50, 21, 46, 23, 15, 26, 8, 47, 40, 3, 32, 22, 34, 42, 16, 41, 24, 10, 4, 28, 36, 30, 37, 35, 20, 17, 45, 43, 25, 19};              //CASE -0           ANSWER -3

        System.out.println("\n \n Swap Count= " + minimumSwaps(arr));
    }

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {

        int min = 0;
        int index1 = 0;
        int index2 = 0;
        int lastIndex = arr.length - 1;
        int temp = 0;
        int saygac = 0;

        for (int k = 0; k < arr.length; k++) {

///////    Part-1        Ededler 1 1 artdigi ucun her addimdaki Min adedi bilmek olur
            min = k + 1;

///////    Part-2        Min ededin yerlesdiyini indexsin ve olmalidi oldugu indexsin tapilmasi
            for (int i = k; i < arr.length; i++) {
                if (arr[i] == min) {
                    index1 = i;
                    index2 = min - 1;
                    break;
                }
            }

///////    Part-3        Eger yerlesdiyi indeksle normalda olmali oldugu indeks eynidirse onda Hemin periodddan yerdeyisme etmeden kecsin
            if (index1 == index2) {
                continue;
            }

///////    Part-4        Yerdeyisme
            if (arr[index1] < arr[index2]) {
                temp = arr[index1];
                arr[index1] = arr[index2];
                arr[index2] = temp;

                saygac++;
            }

//            System.out.println("\n" + k);
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + " ");
//            }
        }

        return saygac;
    }

}
