public class Menu {
    String menuName;
    String menuExplain;

    public Menu(){}
    public Menu (String menuName, String menuExplain){
        this.menuName= menuName;
        this.menuExplain = menuExplain;
    }
    public void setMenuName (String menuName) {
        this.menuName = menuName;
    }
    public String getMenuName(){
        return menuName;
    }
    public void setMenuExplain(String menuExplain){
        this.menuExplain = menuExplain;
    }
    public String getMenuExplain(){
        return menuExplain;
    }
}
