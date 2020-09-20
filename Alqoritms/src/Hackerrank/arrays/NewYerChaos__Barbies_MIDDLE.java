/*

                          New  Year Chatic



//eger 3yni sexs rusvet vererek 2 defeden cox one kecibse onda -----  TOO CHOASTIC--- sozu yazilmalidi ekrana
//eger 1 sexs 2 deneden artiq rusvet verib one kecmeyibse siranin evvelki veziyyete kecmei ucun edilen yerdeyismelerin sayini ekrana yazmaq lazimdi     


                           CASE-0
input : 2 1 5 3 4
output :  3

input : 2 5 1 3 4
output :   Too Chaotic

2 1 5 3 4
2 1 3 5 4    hec bir sexs 3 den cox yereyisme etmediyinden umumi yerdeyismelerinn sayi yazilir  --- 3
2 1 3 4 5   
1 2 3 4 5

2 5 1 3 4
2 1 5 3 4   5 ci sexs 3 defe yeryisme edib(rusvet vererek one kecib)-----   TOO CHOASTIC
2 1 3 5 4
2 1 3 4 5 
1 2 3 4 5


                               CASE-1
INPUT  ---- 5 1 2 3 7 8 6 4 
OUTPUT ---- Too Chaostic


INPUT  ----  1 2 5 3 7 8 6 4
OUTPUT ----  7

5 1 2 3 7 8 6 4 
5 1 2 3 7 8 4 6                       
5 1 2 3 7 4 8 6                        5 -4  Too Chaotic
5 1 2 3 4 7 6 8
5 1 2 3 4 6 7 8
1 5 2 3 4 6 7 8
1 2 5 3 4 6 7 8 
1 2 3 5 4 6 7 8 
1 2 3 4 5 6 7 8

1 2 5 3 7 8 6 4
1 2 5 3 7 8 4 6                         7 Barbies
1 2 5 3 7 4 8 6                         
1 2 5 3 7 4 6 8                         
1 2 5 3 4 7 6 8                          
 1 2 5 3 4 6 7 8
 1 2 3 5 4 6 7 8 
 1 2 3 4 5 6 7 8


                                        CASE – 2 

INPUT  ----  1 2 5 3 4 7 8 6 
OUTPUT ----  4

1 2 5 3 4 7 8 6                  
1 2 5 3 4 7 6 8
1 2 5 3 4 6 7 8          4 Barbies  
1 2 3 5 4 6 7 8
1 2 3 4 5 6 7 8

 */
package Hackerrank.arrays;

import java.util.ArrayList;
import java.util.List;
import sun.security.util.Length;

public class NewYerChaos__Barbies_MIDDLE {

    public static void main(String[] args) {

//        int arr[] = {2, 5, 1, 3, 4};
//      int arr[] = {2,1,5,3,4};
        int arr[] = {1, 2, 5, 3, 4, 7, 8, 6};

        /*
        2 5 1 3 4
        2 1 5 3 4 
         */
        minimumBribes(arr);
    }

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {

///-------------------------PART-1 ----------Global varibales
        int counter = 0;
        int bribes = 0;
        int currentIndex = 0;
        int normalIndex = 0;
        int temp = 0;
        int min = q[0];
        List<Integer> bribesList = new ArrayList<>();
        int maxBribes = 0;

///-------------------------PART-2 ---------- FIND MIN VALUE in Q array
        for (int i = 0; i < q.length; i++) {
            if (q[i] < min) {
                min = q[i];
            }
        }

///-------------------------PART-3 ---------- FIND  BRIBES_COUNT for  every Person and  add array
        for (int i = 0; i < q.length; i++) {
            bribes = 0;
            normalIndex = q[i] - min;
            currentIndex = i;
            bribes = normalIndex - currentIndex;
            bribesList.add(bribes);
        }

///-------------------------PART-4 ---------- ALL STEP_COUNT

        for (int j = 0; j < q.length - 1; j++) {

            for (int i = 0; i < q.length - 1; i++) {

                if (q[i] > q[i + 1]) {
                    counter++;
                    temp = q[i];
                    q[i] = q[i + 1];
                    q[i + 1] = temp;
                }
            }

// Time Out Erroru vermesin deye bu serti yoxluyuram 
// Meselen eger 2 ci periodda  siyahi tam sekilde azdan-coxa duzulubse qalan periodlari yoxlamasin
            int miniCounter = 0;
            for (int i = 0; i < q.length - 1; i++) {

                if (q[i] > q[i + 1]) {
                    miniCounter++;
                }

            }
            if (miniCounter == 0) {
                break;
            }
        }

///-------------------------PART-5 ---------- FIND  MAX  BRIBES_COUNT
        maxBribes = bribesList.get(0);
        for (int i = 0; i < bribesList.size(); i++) {
            if (maxBribes < bribesList.get(i)) {
                maxBribes = bribesList.get(i);
            }
        }

///-------------------------PART-6 ---------- Define Result
        if (maxBribes > 2) {
            System.out.println("Too chaotic");
        } else {
            System.out.println(counter);
        }

    }///method

}//class
