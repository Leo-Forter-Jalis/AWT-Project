package com.LFJ.main.Window.WindowController;

import com.LFJ.main.Window.Windows.WindowOne;
import com.LFJ.main.Window.Windows.WindowTwo;

public class WindowInit {

    WindowOne windowOne;
    WindowTwo windowTwo;

    public void startInit(){
        windowOne = new WindowOne("Test", "Test1", "Test2", "Test3", "Test4", "Test5", "Test6");
        windowTwo = new WindowTwo();
    }

    public void renderStart(){
        windowOne.render();
    }

}
