package com.LFJ.main;

import java.util.Timer;
import java.util.TimerTask;

public class TimerClass {
    public void start (int countdown, final int WEIGHT, final int HEIGHT){

        Timer timer = new Timer();

        TimerTask timertask = new TimerTask() {
            int num = countdown;
            @Override
            public void run() {

                if(num > 0){
                    System.out.printf("There's still time left: %d\n", num);
                    num--;
                }else{
                    System.out.printf("There's still time left: %d\nStarting GUI!", num);
                    timer.cancel();

                }

            }
        };

        timer.scheduleAtFixedRate(timertask, 0,1000);

    }
}
