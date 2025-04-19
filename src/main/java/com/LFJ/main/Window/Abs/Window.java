package com.LFJ.main.Window.Abs;

import java.awt.*;
import java.awt.event.*;

public abstract class Window {

    public void render(Frame frame, Panel panel, MenuBar menuBar){
        frame.setSize(512, 512);
        frame.setLayout(new GridLayout());
        frame.add(panel);
        frame.setMenuBar(menuBar);

        frame.setVisible(true);

        // return frame;
    }

    public void close(Frame frame){
        frame.dispose();
    }

}
