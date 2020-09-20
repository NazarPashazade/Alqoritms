package Hackerrank;

/////     qarsisina 0-dan 0-a tullanaraq uzerinden tullanaraq gedilmelidi // min ylu tap,aliyiq
////  eger 3sifir yanasi olarsa 1ciden 3cuye tullana biler
/////     0,1,0,1,1,0,1,0,0,1   mes : burda 4 tullanis olacaq  0-2-5-7-8
/////     0 0 0 0 1 0           mes : burda 0-3-4-6
public class Jumping_From_0_To_0 {

    
    public static void main(String[] args) {
//        int c[] = {0 ,0 ,1, 0, 0, 1, 0};               //case 0    4
//        int c[] = {0, 0, 0, 0, 1, 0};                  //case 1    3
//        int c[] = {0, 0 ,1 ,0 ,0 ,0 ,0 ,1 ,0 ,0};      //case2   6
        int c[]={0,1 ,0 ,1 ,0 ,1 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,1 ,0 ,1 ,0 ,0 ,0 ,0 ,1 ,0 ,1 ,0 ,
            0 ,1 ,0 ,0 ,0 ,1 ,0 ,1 ,0 ,0, 0, 1, 0 ,1 ,0 ,1 ,0 ,1 ,0 ,0 ,0 ,1 ,0 ,0 ,0 ,0 ,
            0 ,1 ,0 ,1 ,0 ,1 ,0, 0 ,1 ,0 ,1 ,0 ,1 , 0, 0 ,1 ,0 ,0 ,0, 0 ,1 ,0, 0, 1, 0 ,0 ,
            0 ,1 ,0 ,0 ,1 ,0 ,1 ,0};                      ///case 8    46 

        System.out.println("Netice = " + jumpingOnClouds(c));
    }

    static int jumpingOnClouds(int[] c) {

        int jumpCount = 0;

        int n = c.length;

        System.out.println("uzunluq =" + n);

        for (int i = 0; i < n; i++) {          ////// find Zero count  
            if (c[i] == 0) {
                jumpCount += 1;
            }
        }
        System.out.println("count zero ="+jumpCount);

        for (int i = 0; i < n - 2; i++) {
            if (c[i] == 0 && c[i + 1] == 0 && c[i + 2] == 0) {     /// eger ardicil 3 0 olarsa
                jumpCount -= 1;
                i=i+1;  //{0, 0 ,1 ,0 ,0 ,0 ,0 ,1 ,0 ,0};   mes bu halda 3->4->5 ve 5->6->7 ni 2defe saymamaq ucundur
            }
        }

        return jumpCount - 1;  /// 0-larin arasindaki addimlar hemise sayindan bir eksik oldugu ucun bele yazmisam
    }
}
