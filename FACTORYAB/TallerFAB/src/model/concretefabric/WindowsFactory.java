package model.concretefabric;

import model.Windowsbutton;
import model.abstractfabric.buttonfactory;
import model.button;

public class WindowsFactory implements buttonfactory {

    @Override
    public button createButton(String type) {
        return new Windowsbutton();
    }
    
}
