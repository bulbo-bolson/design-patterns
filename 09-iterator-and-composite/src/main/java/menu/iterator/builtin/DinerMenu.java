package menu.iterator.builtin;

import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        MenuItem veggetarianBlt = new MenuItem("vegetarian BLT", "vegetarian BLT", true, 20);
        addItem(veggetarianBlt);
        MenuItem pasta = new MenuItem("Pasta", "pasta", true, 30);
        addItem(pasta);
    }

    public void addItem(MenuItem menu)
    {
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menu;
            numberOfItems = numberOfItems + 1;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator<String> createIterator() {
        return new DinerMenuIterator(menuItems);
    }

    public String toString() {
        return "Diner Menu";
    }
    // other menu methods here
}

