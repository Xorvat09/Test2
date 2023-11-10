package org.example;
import java.security.SecureRandom;

public class Main {
    static String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@$%^&*";
    static SecureRandom rnd = new SecureRandom();
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(randomPass(symbols, 8));
        }

    }

    public static String randomPass(String symbols, int len){
        StringBuilder pass = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            pass.append(symbols.charAt(rnd.nextInt(symbols.length())));
        }
        return pass.toString();
    }
}