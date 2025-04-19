package com.LFJ.main.Window.Controller;

import com.LFJ.main.Window.Windows.WindowTwo;

public class WindowTwoController {

    WindowInit winInit = new WindowInit();

    private WindowTwo window;

    public void run(){
        this.window = winInit.initWindow();
        rendering();
    }

    public void close(){
        window.close();
    }

    public boolean isRun(){
        try {
            return window.isRun();
        }catch (Exception e){
            return false;
        }
    }

    private void rendering(){
        window.render();
    }

}
