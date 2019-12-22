package menu;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;

    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
