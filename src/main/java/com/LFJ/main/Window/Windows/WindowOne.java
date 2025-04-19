package com.LFJ.main.Window.Windows;

import java.awt.*;
import java.awt.event.*;
import com.LFJ.main.Window.Abs.Window;
import com.LFJ.main.Window.Controller.WindowTwoController;

public class WindowOne extends Window {

    WindowTwoController controller = new WindowTwoController();

    private Frame frame = new Frame("WindowOne");
    private Panel panel = new Panel();

    private MenuBar menuBar = new MenuBar();
    private Menu menu = new Menu("Menu");
    private MenuItem item1 = new MenuItem("Open");
    private MenuItem item2 = new MenuItem("Exit");

    private Label label1 = new Label("LOL");
    private Label label2 = new Label("           ");
    private Button button1 = new Button("Ye");
    private Button button2 = new Button("O");

    public WindowOne(){
        Component[] components = {label1, button1, button2, label2};
        for(Component comp : components){
            panel.add(comp);
        }

        menu.add(item1);
        menu.add(item2);
        menuBar.add(menu);

    }

    public void render(){
        super.render(frame, panel, menuBar);
        logic();
    }

    public void close(){
        super.close(frame);
    }

    private void logic (){

        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                if(controller.isRun()) {
                    controller.close();
                    close();
                }else{
                    close();
                }
            }
        });

        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.run();
            }
        });


    }

}
