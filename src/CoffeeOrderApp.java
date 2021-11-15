import products.*;
import ui.Menu;
import ui.OrderTakingMenu;
import ui.StatisticsMenu;
import controllers.OrderController;
public class CoffeeOrderApp {
    public static void main(String[] args) {
        //Currently everything is in main... Hmm maybe someone should fix this? Maybe if one had a pattern to follow
        //Could be a pattern to "control" the flow of execution
        OrderController.MainMenu();
    }
}
