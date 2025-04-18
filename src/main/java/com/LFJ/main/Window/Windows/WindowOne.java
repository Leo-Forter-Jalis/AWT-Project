package com.LFJ.main.Window.Windows;

import java.awt.*;
import java.awt.event.*;

public class WindowOne {

    Frame frame = new Frame();
    Panel panel = new Panel();
    MenuBar menuBar = new MenuBar();

    Menu menu = new Menu();
    MenuItem item1 = new MenuItem();
    MenuItem item2 = new MenuItem();

    Label label1 = new Label();
    Label label2 = new Label();
    Button button1 = new Button();
    Button button2 = new Button();

//    public WindowOne(){
//
//    }

    public WindowOne(String title, String strMenuName , String nameItem1, String nameItem2, String strLabel1, String strButton1, String strButton2){

        frame.setTitle(title);
        frame.setLayout(new FlowLayout());

        menu.setLabel(strMenuName);
        item1.setLabel(nameItem1);
        item2.setLabel(nameItem2);

        label1.setText(strLabel1);
        button1.setLabel(strButton1);
        button2.setLabel(strButton2);

        pullData();

    }

    private void pullData(){

         Component[] components0 = {label1, label2, button1, button2};
         MenuItem[] items = {item1, item2};
         for(Component comp : components0){
             panel.add(comp);
         }

         for(MenuItem item : items){
             menu.add(item);
         }
         menuBar.add(menu);

    }

    public void render(){
        frame.setSize(512, 512);
        frame.setLayout(new FlowLayout());
        frame.add(panel);
        frame.setMenuBar(menuBar);
        frame.setVisible(true);

        logic();
    }

    private void logic (){

        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label2.setText("LOL"); // Заглушка
            }
        });

        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                label2.setText("No LOL"); // Заглушка
            }
        });

        item1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                label2.setText("Help me!"); // Заглушка
            }

        });

        item2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                label2.setText("HELP ME!!!!!"); // Заглушка
            }

        });

    }

}
