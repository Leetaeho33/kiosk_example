public class OrderPage extends Page{
    public OrderPage(){}
    public OrderPage(Cart cart){
        getOrderPageBasicForm();

    }
    public void getOrderPageBasicForm(){
        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println();
    }
    public void getCartProduct(Cart cart){
        System.out.println("[ Orders ]");
        cart.showCart();
        System.out.println("[ Total ]");
        System.out.println(cart.getTotalPrice()+"원");
    }

    public void getLastForm(){
        System.out.println("1. 주문      2. 메뉴판");
    }

}
