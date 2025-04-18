package com.LFJ.main.Window.Windows;

import java.awt.*;
import java.awt.event.*;

public class WindowTwo {

    Frame frame = new Frame();
    Panel panel = new Panel();

    MenuBar menuBar = new MenuBar();
    Menu menu = new Menu();
    MenuItem item = new MenuItem();

    Label label1 = new Label();
    Label label2 = new Label();
    Button button1 = new Button();
    Button button2 = new Button();

//    public WindowTwo(){
//
//    }

    public WindowTwo(String title, String nameMenu, String itemName, String label1Text, String label2Text, String button1Name, String button2Name){

        frame.setTitle(title);
        menu.setLabel(nameMenu);
        item.setLabel(itemName);
        label1.setText(label1Text);
        label2.setText(label2Text);
        button1.setLabel(button1Name);
        button2.setLabel(button2Name);

        pullData();

    }

    private void pullData(){

        Component[] components = {label1, button1, button2, label2};
        menu.add(item);
        for(Component comp : components){
            panel.add(comp);
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

    public void closeWindow (){
        frame.dispose();
    }

    private void logic (){

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }
        });

        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                label2.setText("LOL"); // Заглушка
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label2.setText("NO LOL!");
            }
        });

        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

    }

}
