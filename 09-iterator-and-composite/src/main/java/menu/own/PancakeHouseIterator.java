package menu;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator {
    ArrayList<MenuItem> items;
    int counter;

    public PancakeHouseIterator(ArrayList<MenuItem> items) {
        this.items = items;
        counter = 0;
    }

    public Object next() {
        MenuItem menu = items.get(counter);
        counter++;
        return menu;
    }

    public boolean hasNext() {
        if (counter >= items.size()) {
            return false;
        } else {
            return true;
        }
    }
}
