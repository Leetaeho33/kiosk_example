import java.util.*;

public class Cart extends Product {
    double totalPrice=0.0;
    String lastAddMenuName="";
    ArrayList<String> menuName = new ArrayList<>();
    ArrayList<String> menuExplain = new ArrayList<>();
    ArrayList<Double> menuPrice = new ArrayList<>();
    ArrayList<Integer> menuCount = new ArrayList<>();

    public Cart(){}

    public void addCart(List<Product> product, int index){
        lastAddMenuName = "";
        int count= 1, ofIndex;
        lastAddMenuName = product.get(index).getMenuName();
        menuExplain.add(product.get(index).getMenuExplain());
        menuPrice.add(product.get(index).getPrice());
        if(menuName.contains(lastAddMenuName)){
            ofIndex = menuName.indexOf(lastAddMenuName);
            count++;
            menuCount.set(ofIndex,count);

        }else{
        menuName.add(product.get(index).getMenuName());
        menuCount.add(count);
        }
    }

    public double getTotalPrice(){
        for(int i = 0; i<menuPrice.size(); i++){
            totalPrice = totalPrice+menuPrice.get(i);
        }
        return totalPrice;
    }
    public void showCart(){
        for (int i=0; i<menuName.size(); i++){
            System.out.println(menuName.get(i) + " " + menuCount.get(i) + "개 " + menuPrice.get(i) + "원 " + menuExplain.get(i));
        }
    }

    public void resetCart(){
        menuName.clear();
        menuExplain.clear();
        menuPrice.clear();
        menuCount.clear();
        totalPrice=0;
    }

    public void cartAddMessage(){
        System.out.println(lastAddMenuName + "가 장바구니에 추가되었습니다.");
        System.out.println();
    }


//////////////////////////////////////////////////map으로 구현 실패////////////////////////////////////////////////////////
//
//    public Cart(Map<Product, Integer> cart){
//        this.cart = cart;
//    }
//
////    public void addProduct(List<Product> product, int menuArray){
////        cart.put(product.get(menuArray), cart.containsKey(product.get(menuArray)) ? cart.get(product.get((menuArray)))+1 : 1);
//    }// cart 객체에 Product 객체와, 해당 객체의 갯수를 넣어주는 것. key값이 중복이 안되므로 key값이 이미 존재할 때 value값이 증가하는 방식!
//
//    // /////////////////////////////// 생략 된 방식은 NPE가 떠서 위의 코드로 대체!/////////////////////////////////////////////////////////
//        //        if(cart.containsKey(product.get(menuArray))) {
////            cart.put((product.get(menuArray)), 1);
////        } else{
////            cart.put((product.get(menuArray)), cart.get(product.get((menuArray)))+1);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    // Map에 저장된 값을 불러올 수가 없음... 이름과 설명을 불러올 수 없다..
//    Iterator<Product> keys = cart.keySet().iterator();
//    public void showCart (Cart cart){
//        while(keys.hasNext()){
//            for (int i= 0; i< product.size(); i++){
//            }
//            System.out.println(keys.next() + new String(String.valueOf(this.cart.get(product))) + ));
//        }
//    }
//
//    public Map<Product, Integer> getCartMap(){
//        return cart;
//    }
//        public void cartAddMessage(Cart cart,int array){
//        System.out.println(keys.next() + "가 장바구니에 추가되었습니다.");
//        System.out.println();
//    }
//
////    public void cartAddMessage(List<Product> product,int array){
////        System.out.println(product.get(array).getMenuName() + "가 장바구니에 추가되었습니다.");
////        System.out.println();
////    }
}
