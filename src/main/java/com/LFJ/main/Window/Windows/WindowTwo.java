package com.LFJ.main.Window.Windows;

import java.awt.*;
import java.awt.event.*;
import com.LFJ.main.Window.Abs.Window;

public class WindowTwo extends Window {

    Frame frame = new Frame("WindowTwo");
    Panel panel = new Panel();

    MenuBar menuBar = new MenuBar();
    Menu menu = new Menu("Menu");
    MenuItem item = new MenuItem("Exit");

    Label label1 = new Label("Lol");
    Label label2 = new Label("        ");
    Button button1 = new Button("1");
    Button button2 = new Button("2");

    public WindowTwo(){
        Component[] components = {label1, button1, button2, label2};
        for(Component comp : components){
            panel.add(comp);
        }

        menu.add(item);
        menuBar.add(menu);

    }

    public boolean isRun (){
        return frame.isVisible();
    }

    public void render(){
        super.render(frame, panel, menuBar);
        logic();
    }

    public void close(){
        super.close(frame);
    }

    private void logic(){

        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                close();
            }
        });

    }

}
