public class Burger extends Product {
    public Burger(String menuName, String menuExplain) {
        this.menuName = menuName;
        this.menuExplain = menuExplain;
    }
    public Burger(String menuName, String menuExplain, double price) {
        this.menuName = menuName;
        this.menuExplain = menuExplain;
        this.price = price;
    }

}
