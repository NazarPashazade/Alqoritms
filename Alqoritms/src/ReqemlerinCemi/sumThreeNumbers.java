package ReqemlerinCemi;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class sumThreeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new TreeSet<Integer>();
        Integer number = 0, sum = 0;

        System.out.println(" Reqem daxil edin : ");
        number = sc.nextInt();                         /////128

        int birinciReqem = number/100;
        int ikinciReqem = (number %100)/10;
        int ucuncuReqem = (number % 10);
        
        sum = birinciReqem + ikinciReqem + ucuncuReqem;

        System.out.println("sum= " + sum);

    }
}
