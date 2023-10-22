import java.util.List;

public class PurchasePage extends MenuPage{
    public PurchasePage(List<Product> p, int index){
        purchaseMenu(p,index);
        purchasePageBasicForm();
    }
    public PurchasePage(){}
    public void purchaseMenu(List<Product> products, int index) {
        System.out.println(products.get(index).getMenuName() +"   " + products.get(index).getMenuExplain() +"   " + products.get(index).getPrice());
        System.out.println();
    }
    public void purchasePageBasicForm(){
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
    }
}
