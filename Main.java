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
                        String resu = Integer.toString(sum);
                        System.out.println(resu);
                    }
                    if (mchar[i] == '-') {
                        sum = a - b;
                        String resu = Integer.toString(sum);
                        System.out.println(resu);
                    }
                    if (mchar[i] == '*') {
                        sum = a * b;
                        String resu = Integer.toString(sum);
                        System.out.println(resu);
                    }
                    if (mchar[i] == '/') {
                        sum = a / b;
                        String resu = Integer.toString(sum);
                        System.out.println(resu);
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
                res.put(21, "XXI");
                res.put(22, "XXII");
                res.put(23, "XXIII");
                res.put(24, "XXIV");
                res.put(25, "XXV");
                res.put(26, "XXVI");
                res.put(27, "XXVII");
                res.put(28, "XXVIII");
                res.put(29, "XXIX");
                res.put(30, "XXX");
                res.put(31, "XXXI");
                res.put(32, "XXXII");
                res.put(33, "XXXIII");
                res.put(34, "XXXIV");
                res.put(35, "XXXV");
                res.put(36, "XXXVI");
                res.put(37, "XXXVII");
                res.put(38, "XXXVIII");
                res.put(39, "XXXIX");
                res.put(40, "XL");
                res.put(41, "XLI");
                res.put(42, "XLII");
                res.put(43, "XLIII");
                res.put(44, "XLIV");
                res.put(45, "XLV");
                res.put(46, "XLVI");
                res.put(47, "XLVII");
                res.put(48, "XLVIII");
                res.put(49, "XLIX");
                res.put(50, "L");
                res.put(51, "LI");
                res.put(52, "LII");
                res.put(53, "LIII");
                res.put(54, "LIV");
                res.put(55, "LV");
                res.put(56, "LVI");
                res.put(57, "LVII");
                res.put(58, "LVIII");
                res.put(59, "LIX");
                res.put(60, "LX");
                res.put(61, "LXI");
                res.put(62, "LXII");
                res.put(63, "LXIII");
                res.put(64, "LXIV");
                res.put(65, "LXV");
                res.put(66, "LXVI");
                res.put(67, "LXVII");
                res.put(68, "LXVIII");
                res.put(69, "LXIX");
                res.put(70, "LXX");
                res.put(71, "LXXI");
                res.put(72, "LXXII");
                res.put(73, "LXXIII");
                res.put(74, "LXXIV");
                res.put(75, "LXXV");
                res.put(76, "LXXVI");
                res.put(77, "LXXVII");
                res.put(78, "LXXVIII");
                res.put(79, "LXXIX");
                res.put(80, "LXXX");
                res.put(81, "LXXXI");
                res.put(82, "LXXXII");
                res.put(83, "LXXXIII");
                res.put(84, "LXXXIV");
                res.put(85, "LXXXV");
                res.put(86, "LXXXVI");
                res.put(87, "LXXXVII");
                res.put(88, "LXXXVIII");
                res.put(89, "LXXXIX");
                res.put(90, "XC");
                res.put(91, "XCI");
                res.put(92, "XCII");
                res.put(93, "XCIII");
                res.put(94, "XCIV");
                res.put(95, "XCV");
                res.put(96, "XCVI");
                res.put(97, "XCVII");
                res.put(98, "XCVIII");
                res.put(99, "XCIX");
                res.put(100, "C");

                Set<Integer> c = res.keySet();
                if(res.containsKey(sum)){
                    System.out.println(res.get(sum));
                    break;
                }


            }


        }

    }
}



















