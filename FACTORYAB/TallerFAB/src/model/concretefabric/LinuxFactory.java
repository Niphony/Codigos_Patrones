package model.concretefabric;

import model.Linuxbutton;
import model.abstractfabric.buttonfactory;
import model.button;

public class LinuxFactory implements buttonfactory {

    @Override
    public button createButton(String type) {
        return new Linuxbutton();
    }
    
}
