package bai3_3;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger big1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger big2 = new BigInteger("22222222222222222222222222222222222222222222222222");

        BigInteger sum = big1.add(big2);
        System.out.println("Ket qua cong: " + sum);

        BigInteger product = big1.multiply(big2);
        System.out.println("Ket qua nhan: " + product);
    }
}
