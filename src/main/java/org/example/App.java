/*
 *  UCF COP3330 Fall 2021 Assignment 1.23 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        String car_issue;

        System.out.printf("Is the car silent when you turn the key? ");
        Scanner x = new Scanner(System.in);
        car_issue = x.nextLine();

        if (car_issue.equals("y")) {
            System.out.printf("Are the battery terminals corroded? ");
            Scanner y = new Scanner(System.in);
            car_issue = y.nextLine();

            if (car_issue.equals("y")) {
                System.out.printf("Clean terminals and try starting again. ");
                return;
            }
            else {
                System.out.printf("Replace cables and try again.");
                return;
            }
        }
        else {
            System.out.printf("Does the car make a slicking noise?");
            Scanner z = new Scanner(System.in);
            car_issue = z.nextLine();

            if (car_issue.equals("y")) {
                System.out.printf("Replace the battery.");
                return;
            }
            else {
                System.out.printf("Does the car crank up but fail to start?");
                Scanner a = new Scanner(System.in);
                car_issue = a.nextLine();

                if (car_issue.equals("y")) {
                    System.out.printf("Check spark plug connections.");
                    return;
                }
                else {
                    System.out.printf("Does the engine start and then die?");
                    Scanner b = new Scanner(System.in);
                    car_issue = b.nextLine();

                    if (car_issue.equals("y")) {
                        System.out.printf("Does you car have fuel injection?");
                        Scanner c = new Scanner(System.in);
                        car_issue = c.nextLine();

                        if (car_issue.equals("y")) {
                            System.out.printf("Get it in for service.");
                            return;
                        }
                        else {
                            System.out.printf("Check to ensure the choke is opening and closing.");
                            return;
                        }
                    }
                    else {
                        System.out.println("This should not be possible.");
                        return;
                    }
                }
            }
        }
    }
}