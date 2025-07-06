package model;

import java.util.ArrayList;
import java.util.List;

import model.componentes.MenuComponent;

public class Menu extends MenuComponent {
    private String name;
    private List<MenuComponent> items = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent component) {
        items.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        items.remove(component);
    }

    @Override
    public MenuComponent getChild(int i) {
        return items.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("\n" + getName());
        for (MenuComponent item : items) {
            item.print();
        }
    }
}