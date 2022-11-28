import AdditionalTask.Ex12;
import AdditionalTask.Ex13;
import ControlStructures.*;
import Cycles.*;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        Ex2 ex2 = new Ex2();
        Ex3 ex3 = new Ex3();
        Ex4 ex4 = new Ex4();
        Ex5 ex5 = new Ex5();
        Ex6 ex6 = new Ex6();
        Ex7 ex7 = new Ex7();
        Ex8 ex8 = new Ex8();
        Ex9 ex9 = new Ex9();
        Ex10 ex10 = new Ex10();
        Ex11 ex11 = new Ex11();
        Ex12 ex12 = new Ex12();
        Ex13 ex13 = new Ex13();



        Scanner sc = new Scanner(System.in);

        int Number;
        int answer = 0;

        while (answer != 14) {
            System.out.print("""
                    CONTROL STRUCTURES\t\tCYCLES\t\t\t\tADDITIONAL TASK
                    1 - Ex 1.1\t\t\t6 - Ex 2.1
                    2 - Ex 1.2\t\t\t7 - Ex 2.2
                    3 - Ex 1.3\t\t\t8 - Ex 2.3
                    4 - Ex 1.4\t\t\t9 - Ex 2.4
                    5 - Ex 1.5\t\t10 - Ex 2.5
                    11 - Ex 2.6\t\t12 - Ex 3.1
                    13 - Ex 3.2
                    Your choice:\s""");
            answer = sc.nextInt();

            switch (answer) {
                case 1 -> {
                    System.out.print("Ex1.1\nEnter number from 1 to 12");
                    Number = sc.nextInt();
                    ex1.seasonsSwitch(Number);
                }
                case 2 -> {
                    System.out.println("Ex1.2\nEnter number from 1 to 12");
                    Number = sc.nextInt();
                    ex2.ifElseSeasons(Number);
                }
                case 3 -> {
                    System.out.println("Ex1.3\nEnter a number");
                    Number = sc.nextInt();
                    ex3.evenUneven(Number);
                }
                case 4 -> {
                    System.out.println("Ex1.4\nEnter a number");
                    Number = sc.nextInt();
                    ex4.weather(Number);
                }
                case 5 -> {
                    System.out.println("Ex1.5\nEnter a number from 1 to 8");
                    Number = sc.nextInt();
                    ex5.colourRainbow(Number);
                }
                case 6 -> {
                    System.out.println("Ex2.1\nUneven Cycle");
                    ex6.unevenCycle();
                }
                case 7 -> {
                    System.out.println("Ex2.2\nDecrement");
                    ex7.decrement();
                }case 8 -> {
                    System.out.println("Ex2.3\nEnter a number");
                    Number = sc.nextInt();
                    ex8.sumOfNumbers(Number);
                }
                case 9 -> {
                    System.out.println("Ex2.4\nSequence");
                    ex9.sequence();
                }
                case 10 -> {
                    System.out.println("Ex2.5\nNegative Sequence");
                    ex10.negativeSequence();
                }
                case 11 -> {
                    System.out.println("Ex2.6\nSquars of numbers");
                    ex11.squarsNumber();
                }
                case 12 -> {
                    System.out.println("Ex3.1\nFibonacci");
                    ex12.fibonacci();
                }
                case 13 -> {
                    System.out.println("Ex3.2\nBank deposit");

                        float contribution;
                    System.out.println("Please, enter summary of your deposit");
                        contribution = sc.nextInt();

                    System.out.println("Please, enter term of your deposit");
                        Number = sc.nextInt();

                    ex13.bankAccount(Number, contribution);
                }
            }
        }
    }
}
