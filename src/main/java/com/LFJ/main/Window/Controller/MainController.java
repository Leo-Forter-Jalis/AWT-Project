package com.LFJ.main.Window.Controller;

import com.LFJ.main.Window.Windows.WindowOne;

public class MainController {

    WindowInit winInit = new WindowInit();

    WindowOne windowOne;

    public void firtsInit(){
        windowOne = winInit.firtsInit();
        rendering();
    }

    private void rendering(){
        windowOne.render();
    }

}
