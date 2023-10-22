public class Drink extends Product {

    public Drink(String menuName, String menuExplain) {
        this.menuName = menuName;
        this.menuExplain = menuExplain;
    }
    public Drink(String menuName, String menuExplain, double price) {
        this.menuName = menuName;
        this.menuExplain = menuExplain;
        this.price = price;
    }
}