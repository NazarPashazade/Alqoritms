package BigInteger;

import java.math.BigInteger;

public class TestBit_Method {

    public static void main(String[] args) {//100011111100

//        BigInteger bi2 = new BigInteger("5");


        int a = 8;
        BigInteger bi1 = BigInteger.valueOf(a);
        
        
        System.out.println(bi1.testBit(4));
        
        

//        Boolean b1, b2;
//
//        BigInteger bi = new BigInteger("10");
//
//        b1 = bi.testBit(2);
//        b2 = bi.testBit(3);
//
//        String str1 = "Test Bit on " + bi + " at index 2 returns " + b1;
//        String str2 = "Test Bit on " + bi + " at index 3 returns " + b2;
//
//        // print b1, b2 values
//        System.out.println(str1);
//        System.out.println(str2);
    }
}

//        BigInteger biginteger = new BigInteger("2300");
//
//        int i = 2;
//
//        boolean flag = biginteger.testBit(i);
//
//        System.out.println("The bit at index " + i + " of "  + biginteger + " is set = " + flag);
//}
//}
