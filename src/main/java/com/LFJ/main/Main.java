package com.LFJ.main;

import java.util.Scanner;
import com.LFJ.main.TimerClass;

public class Main {

    public static void main(String [] args){
        logic();
    }

    private static void logic(){

        TimerClass timer = new TimerClass();

        boolean logic = false;

        System.out.println("\nWelcome to the GUI-enabled program!");
        System.out.println("But you will say that there is no GUI here, and for a while you will be right.");
        System.out.println("I'll only ask you one thing. Do you want to continue?");

        System.out.print("Enter your answer (y/n) >> ");
        logic = input();

        if(!logic){
            System.out.println("\nGoodbye! I'll see you another time.");
        }else{
            timer.start(10);
        }

    }

    private static boolean input(){

        Scanner scan = new Scanner(System.in);
        while(true){

            String str = scan.nextLine();
            if(str.equals("Y") || str.equals("y")){
                scan.close();
                return true;
            } else if (str.equals("N") || str.equals("n")) {
                scan.close();
                return false;
            }else{
                System.out.print("Input error!\nRepeat the input again.\nRe-entry (y/n) >> : ");
            }

        }

    }

}
