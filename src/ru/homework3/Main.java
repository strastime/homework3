package ru.homework3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(10);
        Scanner scanner = new Scanner(System.in);

        int n = 2;

        System.out.println("Угодай число от 0 до 9, у тебя " + (n + 1) + " попыток");

        for (int i = 0; i <= n; i++) {

            int answer = scanner.nextInt();

            if (answer == x) {
                System.out.println("Поздравляю вы угадали  это число " + x);
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                int answer2 = scanner.nextInt();
                if (answer2 == 1)
                {
                    x = random.nextInt(10);
                    i = 0;
                    System.out.println("Угодай число от 0 до 9, у тебя " + (n + 1) + " попыток");
                }
                else
                {

                    i = n + 1;
                    System.out.println("Пока");
                }

            }
            else
            {
                if (answer > x){
                    System.out.println("Число "+ answer + " больше загаданного, осталось попыток "+ (n-i) );

                }
                else {
                    System.out.println("Число "+ answer + " меньше загаданного, осталось попыток "+ (n-i) );

                }


            }
            if (i == n) {

                System.out.println("Увы, вы  не угадали  это число " + x);
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                int answer2 = scanner.nextInt();
                if (answer2 == 1)
                {
                    x = random.nextInt(10);
                    i = 0;
                    System.out.println("Угодай число от 0 до 9, у тебя " + (n + 1) + " попыток");
                }
                else
                {
                    System.out.println("Пока");
                }

            }


        }



    }
}
