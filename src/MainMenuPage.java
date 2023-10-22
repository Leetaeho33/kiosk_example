import java.util.List;

public class MainMenuPage extends Page{
    public MainMenuPage(){}
    public MainMenuPage(List<Menu> menu, String name){
//        super.getBasicForm();
//        super.getMenu(menu, name);
//        getOrderMenu();
    }
    public void getOrderMenu(){
        System.out.println("[ ORDER MENU ]");
        System.out.println(commandNumber+". " + "Order  장바구니를 확인 후 주문합니다.");
        commandNumber++;
        System.out.println(commandNumber+". " + "Cancel  진행중인 주문을 취소합니다.");
    }
}
