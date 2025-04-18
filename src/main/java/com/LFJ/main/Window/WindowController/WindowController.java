package com.LFJ.main.Window.WindowController;

import com.LFJ.main.Window.WindowController.WindowInit;

public class WindowController {

    WindowInit windowInit = new WindowInit();

    public void start(){
        windowInit.startInit();
        windowInit.renderStart();
    }

}
