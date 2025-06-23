package model.concretefabric;

import model.Macbutton;
import model.abstractfabric.buttonfactory;

public class MacFactory implements buttonfactory {

    @Override
    public model.button createButton(String type) {
        return new Macbutton();
    }
    

}
