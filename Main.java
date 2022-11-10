package ru.javaschool.test.calculator;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter expression in one line with blanks, ex. a + b: ");
        calc();
    }

    public static void calc() throws IOException {
        int result;
        char operation;
        Scanner scanner = new Scanner(System.in);
        romanNumb resq = romanNumb.III;

        if (scanner.hasNextInt()) {
            String input = scanner.nextLine();
            if (input.length() > 7 | input.length() < 5) {
                try {
                    throw new IOException();
                } finally {
                    System.out.println("Number of symbols is not correct");
                }
            }
            String[] str = input.split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[2]);
            if (a > 10 | a < 1 | b < 1 | b > 10) {
                System.out.println("Enter number from 1 to 10!");
            } else {
                int sum;
                char[] mchar = new char[10];
                for (int i = 0; i < input.length(); i++) {
                    mchar[i] = input.charAt(i);
                    if (mchar[i] == '+') {
                        sum = a + b;
                        System.out.println(sum);
                    }
                    if (mchar[i] == '-') {
                        sum = a - b;
                        System.out.println(sum);
                    }
                    if (mchar[i] == '*') {
                        sum = a * b;
                        System.out.println(sum);
                    }
                    if (mchar[i] == '/') {
                        sum = a / b;
                        System.out.println(sum);
                    }
                }
            }
        } else {
            String input1 = scanner.nextLine();
            String[] str1 = input1.split(" ", 3);
            romanNumb roman = romanNumb.II;
            romanNumb[] Roman = romanNumb.values();
            String name = str1[0];
            romanNumb roMan = romanNumb.valueOf(name);
            String name2 = str1[2];
            romanNumb rooman = romanNumb.valueOf(name2);
            int a = roMan.getArab();
            int b = rooman.getArab();
            int sum = 0;
            if (a < 0 | a > 10) {
                try {
                    throw new IOException();
                } finally {
                    System.out.println("Paste symbol equals from 1 to 10.");
                }
            }
            if (b < 0 | b > 10) {
                try {
                    throw new IOException();
                } finally {
                    System.out.println("Paste symbol equals from 1 to 10.");
                }
            }
            char[] mchar = new char[10];
            for (int i = 0; i < input1.length(); i++) {
                mchar[i] = input1.charAt(i);
                if (mchar[i] == '+') {
                    sum = a + b;

                }
                if (mchar[i] == '-') {
                    if (a < b) {
                        System.out.println("There are no negative numbers in roman notation.");
                    } else {
                        sum = a - b;
                    }
                }
                if (mchar[i] == '*') {
                    sum = a * b;
                }
                if (mchar[i] == '/') {
                    sum = a / b;
                }
                HashMap<Integer, String> res = new HashMap<>();
                res.put(1, "I");
                res.put(2, "II");
                res.put(3, "III");
                res.put(4, "IV");
                res.put(5, "V");
                res.put(6, "VI");
                res.put(7, "VII");
                res.put(8, "VIII");
                res.put(9, "IX");
                res.put(10, "X");
                res.put(11, "XI");
                res.put(12, "XII");
                res.put(13, "XIII");
                res.put(14, "XIV");
                res.put(15, "XV");
                res.put(16, "XVI");
                res.put(17, "XVII");
                res.put(18, "XVIII");
                res.put(19, "XIX");
                res.put(20, "XX");

                Set<Integer> c = res.keySet();
                if(res.containsKey(sum)){
                    System.out.println(res.get(sum));
                    break;
                }


            }


        }

    }
}



















