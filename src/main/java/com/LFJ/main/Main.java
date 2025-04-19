package com.LFJ.main;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        logic(); // Передаём управление методу logic()
    }

    private static void logic(){ // Основная логика программы

        TimerClass timer = new TimerClass();

        boolean logicValue;

        System.out.println("\nWelcome to the GUI-enabled program!");
        System.out.println("But you will say that there is no GUI here, and for a while you will be right.");
        System.out.println("I'll only ask you one thing. Do you want to continue?");

        System.out.print("Enter your answer (y/n) >> ");
        logicValue = input();

        if(!logicValue){
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
                scan.close(); // Закрываем сканер после ввода
                return true;
            } else if (str.equals("N") || str.equals("n")) {
                scan.close(); // Закрываем сканер после ввода
                return false;
            }else{
                System.out.print("Input error!\nRepeat the input again.\nRe-entry (y/n) >> : ");
            }

        }

    }

}
