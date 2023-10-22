public class Product extends Menu{
    double price;

    public Product(){}
    
    public Product(String menuName, String menuExplain, double price) {
        this.menuName = menuName;
        this.menuExplain = menuExplain;
        this.price = price;
    }
    public void setPrice (double price){
        this.price= price;
    }
    public double getPrice (){
        return price;
    }
}
