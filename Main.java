package ru.javaschool.test.calculator;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter expression in one line with blanks, ex. a + b: ");
        calc();
        }
         // не могу найти решение для римских чисел, мне кажется, что я что-то важное упускаю. Пробовала через Enum, и HashMap, и просто два массива, но что-то все время не то.
        public static void calc() {
            int result;
            char operation;
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                String input = scanner.nextLine();
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
                String[] str1 = input1.split(" ");
                String z = str1[0];
                String x = str1[2];
                Map<String, Integer> map = new HashMap<>();
                {
                    map.put("I", 1);
                    map.put("II", 2);
                    map.put("III", 3);
                    map.put("IV", 4);
                    map.put("V", 5);
                    map.put("VI", 6);
                    map.put("VII", 7);
                    map.put("VIII", 8);
                    map.put("IX", 9);
                    map.put("X", 10);
                }
                int result1 = 0;
                int prev = 0;
                for (int i = input1.length() - 1; i >= 0; i--) {
                    int curr = map.get(input1.charAt(i));
                    if (curr < prev) {
                        result1 -= curr;
                    } else {
                        result1 += curr;
                    }
                    prev = curr;

                }


            }
        }








            }

















