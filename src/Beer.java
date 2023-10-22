public class Beer extends Product {

    public Beer(String menuName, String menuExplain) {
        this.menuName = menuName;
        this.menuExplain = menuExplain;
    }
    public Beer(String menuName, String menuExplain, double price) {
        this.menuName = menuName;
        this.menuExplain = menuExplain;
        this.price = price;
    }
}
