/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YARIS__2__MERHELE;

import java.math.BigInteger;

/**
 *
 * @author pashayev
 */
public class TestBit {

    public static void main(String[] args) {  // 10110  01101

        System.out.println(BigInteger.valueOf(22).toString(2));
        System.out.println(BigInteger.valueOf(22).testBit(3));
    }
}
