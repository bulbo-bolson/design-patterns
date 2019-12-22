import menu.builtin.DinerMenu;
import menu.builtin.PancakeHouseMenu;
import menu.builtin.Waitress;
import org.junit.Test;

public class MenuTest {

    @Test
    public void testMenu() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
