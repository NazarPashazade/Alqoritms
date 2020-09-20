package Hackerrank.Search;

public class Ice_Cream_Parlor___EASY {

    public static void main(String[] args) {

//        int arr[] = {1, 4, 5, 3, 2};   // 1 3
//        int k = 4;
        int arr[] = {2, 2 ,4 ,3};  /// 2 2
        int k = 4;
        System.out.println(icecreamParlor(k, arr));
    }
//    
//    
//    
//    
//
//    

    static int[] icecreamParlor(int m, int[] arr) {
//
//        System.out.println("m = " + m);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        int results[] = new int[2];

        boolean completed = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length;) {
                int sum = arr[i] + arr[j];
                if (sum == m) {
                    System.out.println("Succes = " + arr[i] + " " + arr[j]);
                    results[0] = i+1;
                    results[1] = j+1;
                    completed = true;
                    break;
                }
                j++;
            }
            if (completed) {
                break;
            }
        }

        return results;
    }

}
