import java.util.List;

public class MenuPage extends Page{

    public MenuPage(){}
    public MenuPage(List<Product> products, String name){
        getBasicForm();
        getProductMenu(products,name);
    }
    public void getProductMenu(List<Product> products, String name) {
        System.out.println("[ " + name + " MENU ]");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(i + 1 + ". " + products.get(i).getMenuName() + products.get(i).getMenuExplain() + products.get(i).getPrice());
        }
        commandNumber = products.size() + 1;
        System.out.println();
    }

}
