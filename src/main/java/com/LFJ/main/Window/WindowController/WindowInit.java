package com.LFJ.main.Window.WindowController;

import com.LFJ.main.Window.Windows.WindowOne;
import com.LFJ.main.Window.Windows.WindowTwo;

public class WindowInit {

    static WindowOne windowOne;
    static WindowTwo windowTwo;

    public void startInit(){
        windowOne = new WindowOne("Test0", "Test1", "Test2", "Test3", "Test4", "Test5", "Test6");
        windowTwo = new WindowTwo("Test7", "Test8", "Test9", "Test10", "Test11", "Test12", "Test13");
    }

    public void renderStart(){
        windowOne.render();
    }

    public void renderWin(){
        windowTwo.render();
    }

    public void closeWin(){
        windowTwo.closeWindow();
    }


}
