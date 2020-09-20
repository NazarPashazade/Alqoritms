package UniuqeArray;

public class UniuqeArray {

    public static void main(String[] args) {

        int array1[] = {1, 1,1 ,4,1, 2, 2, 2, 3, 3};
        int array2[]=new int[10];
        int count=0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if(array1[i]==array1[j]){
                    count++;
                }
            }
            if(count>1){               
                array2[0]=5;
            }
            count=0;
                        
        }
                System.out.println(array2[5]);

    }
}
