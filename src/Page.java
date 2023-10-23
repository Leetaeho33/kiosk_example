import java.util.List;

public class Page {
    int commandNumber;
    public void getBasicForm(){
        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"\n" +
                "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
    }

    public void getMenu(List<Menu> menu, String name){
        System.out.println("[ " + name +" MENU ]");
        for (int i=0; i<menu.size(); i++){
            System.out.println(i+1 + ". " + menu.get(i).getMenuName()+ "  " + menu.get(i).getMenuExplain());
        }
        commandNumber = menu.size()+1;
        System.out.println();
    }

}
