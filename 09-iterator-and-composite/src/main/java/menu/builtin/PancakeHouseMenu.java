package menu.builtin;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        MenuItem kBpancake = new MenuItem("K&B pancake", "K&B Pancake Breakfast", false, 10);
        addItem(kBpancake);
        MenuItem regularPancake = new MenuItem("Regular pancake", "Regular Pancake Breakfast", false, 5);
        addItem(regularPancake);
    }

    public void addItem(MenuItem menu)
    {
        menuItems.add(menu);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItems);
    }

    public String toString() {
        return "Pancake House Menu";
    }

    // other menu methods here
}
