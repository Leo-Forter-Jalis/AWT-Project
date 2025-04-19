package com.LFJ.test;

import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String [] args){

        Frame frame = new Frame("Window");
        Canvas canvas = new Canvas();
        List list = new List();
        list.add("Lol", 1);
        list.add("Moo", 2);
        list.add("LOR", 3);
        list.setSize(20, 10);
        frame.setSize(512, 512);
        frame.setLayout(new FlowLayout());
        frame.add(list);
        frame.add(canvas);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }
        });

    }

}
