package menu;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position;

    public PancakeHouseIterator(ArrayList<MenuItem> items) {
        this.items = items;
        position = 0;
    }

    public Object next() {
        MenuItem menu = items.get(position);
        position = position + 1;
        return menu;
    }

    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }
}
