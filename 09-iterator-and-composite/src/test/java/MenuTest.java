import menu.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class MenuTest {

    @Test
    public void testMenu() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
