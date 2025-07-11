package model;

public abstract class Casa {
    protected Cortina color;
    public Casa(Cortina color) {
        this.color = color;
    }
    public abstract String mover();
}
