package menu;

import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItems;

    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItems);
    }
}
