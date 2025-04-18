package com.LFJ.main.Window.WindowController;

public class WindowController {

    WindowInit windowInit = new WindowInit();

    public void start(){
        windowInit.startInit();
        windowInit.renderStart();
    }

}
