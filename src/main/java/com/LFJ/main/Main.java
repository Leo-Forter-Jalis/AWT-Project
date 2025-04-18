package com.LFJ.main;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        logic();
    }

    private static void logic(){

        boolean logic = false;

        System.out.println("\nWelcome to the GUI-enabled program!");
        System.out.println("But you will say that there is no GUI here, and for a while you will be right.");
        System.out.println("I'll only ask you one thing. Do you want to continue?");

        System.out.print("Введите ваш ответ (y/n) >> ");
        logic = input();

        if(!logic){
            System.out.println("\nGoodbye! I'll see you another time.");
        }else{

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
                System.out.print("Ошибка ввода!\nПовторите ввод ещё раз.\nПовторный ввод (y/n) >> : ");
            }

        }

    }

}
