import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int commandNumber = 0;
        ///////////////////////////////////////////메인 메뉴판 구현부//////////////////////////////////////////////////////
        Menu burger = new Burger("Burger", "앵거스 비프 통살을 다져만든 버거");
        Menu frozenCustard = new FrozenCustard("FrozenCustard", "매장에서 신선하게 만드는 아이스크림");
        Menu drink = new Drink("Drink", "매장에서 직접 만드는 음료");
        Menu beer = new Beer("Beer", "뉴욕 브루클린 브루어리에서 양조한 맥주");

        List<Menu> menuArray = new ArrayList<>();
        menuArray.add(burger);
        menuArray.add(frozenCustard);
        menuArray.add(drink);
        menuArray.add(beer);
        String mainPageSt = "SHAKESHACK";
        MainMenuPage mainMenuPage = new MainMenuPage(menuArray, mainPageSt);
        Scanner scn = new Scanner(System.in);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ///////////////////////////////////////////버거 카테고리 메뉴판/////////////////////////////////////////////////////
        List<Product> burgerArray = new ArrayList<>();
        String burgerPageSt = "Burgers";
        Product shackBurger = new Burger("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9);
        Product smokeShack = new Burger("SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9);
        Product shroomBuger = new Burger("Shroom Burger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4);
        Product cheeseburger = new Burger("Cheeseburger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 6.9);
        Product hamburger = new Burger("Hamburger", "비프패티를 기반으로 야채가 들어간 기본버거", 5.4);
        burgerArray.add(shackBurger);
        burgerArray.add(smokeShack);
        burgerArray.add(shroomBuger);
        burgerArray.add(cheeseburger);
        burgerArray.add(hamburger);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //////////////////////////////////////////frozenCustard 카테고리 메뉴판/////////////////////////////////////////////
        List<Product> frozenCustardArray = new ArrayList<>();
        String frozenCustardSt = "FrozenCustards";
        Product frozenCustard1 = new FrozenCustard("FrzonCustard", "얼린 커스타드에요!", 5.5);
        Product unFrozenCustard = new FrozenCustard("UnFrozonCustard", "녹은 커스타드에요ㅠㅠ", 4.5);
        frozenCustardArray.add(frozenCustard1);
        frozenCustardArray.add(unFrozenCustard);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //////////////////////////////////////////드링크 카테고리 메뉴판/////////////////////////////////////////////////////
        List<Product> drinkArray = new ArrayList<>();
        String drinkPageSt = "Drinks";
        Product coca = new Drink("CocaCola", "코카콜라 맛있다.", 2.0);
        Product pepsi = new Drink("Pepsi", "펩시콜라도 맛있다.", 2.0);
        Product cider = new Drink("칠성사이다", "칠성사이다도 맛있다.", 2.0);
        Product shake = new Drink("MilkShake", "쉑쉑은 밀크쉐이크", 4.0);
        drinkArray.add(coca);
        drinkArray.add(pepsi);
        drinkArray.add(cider);
        drinkArray.add(shake);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //////////////////////////////////////////맥주 카테고리 메뉴판ㅋ/////////////////////////////////////////////////////
        List<Product> beerArray = new ArrayList<>();
        String beerPageSt = "Beers";
        Product cass = new Beer("CASS", "카스 맛있다.", 5.0);
        Product terra = new Beer("TERRA", "테라 맛있다.", 5.0);
        Product ob = new Beer("OB", "오비 맛있다.", 5.0);
        beerArray.add(cass);
        beerArray.add(terra);
        beerArray.add(ob);
        //////////////////////////////////////////사용자 컨트롤 & 출력부/////////////////////////////////////////////////////
        MenuPage burgerPage = new MenuPage();
        MenuPage frozenCustardPage = new MenuPage();
        MenuPage drinkPage = new MenuPage();
        MenuPage beerPage = new MenuPage();

        Cart shoppingCart = new Cart();
        PurchasePage purchasePage = new PurchasePage();
        OrderPage orderPage = new OrderPage();
        OrderCompletePage orderCompletePage = new OrderCompletePage();
        OrderCancelPage orderCancelPage = new OrderCancelPage();
        Cart totalSell = new Cart();

        while (commandNumber != 99) {
            mainMenuPage.getBasicForm();
            mainMenuPage.getMenu(menuArray, mainPageSt);
            mainMenuPage.getOrderMenu();
            commandNumber = scn.nextInt();
            switch (commandNumber) {
                case 1:
                    burgerPage.getBasicForm();
                    burgerPage.getProductMenu(burgerArray, burgerPageSt);
                    commandNumber = scn.nextInt();
                    switch (commandNumber) {
                        case 1:
                            purchasePage.purchaseMenu(burgerArray, 0);
                            purchasePage.purchasePageBasicForm();
                            commandNumber = scn.nextInt();
                            if (commandNumber == 1) {
                                shoppingCart.addCart(burgerArray, 0);
                                shoppingCart.cartAddMessage();
                            } else {
                                System.out.println("주문을 취소하셨습니다.");
                            }
                            break;
                        case 2:
                            purchasePage.purchaseMenu(burgerArray, 1);
                            purchasePage.purchasePageBasicForm();
                            commandNumber = scn.nextInt();
                            if (commandNumber == 1) {
                                shoppingCart.addCart(burgerArray, 1);
                                shoppingCart.cartAddMessage();
                            } else {
                                System.out.println("주문을 취소하셨습니다.");
                            }
                            break;

                        case 3:
                            purchasePage.purchaseMenu(burgerArray, 2);
                            purchasePage.purchasePageBasicForm();
                            commandNumber = scn.nextInt();
                            if (commandNumber == 1) {
                                shoppingCart.addCart(burgerArray, 2);
                                shoppingCart.cartAddMessage();
                            } else {
                                System.out.println("주문을 취소하셨습니다.");
                            }
                            break;
                        case 4:
                            purchasePage.purchaseMenu(burgerArray, 3);
                            purchasePage.purchasePageBasicForm();
                            commandNumber = scn.nextInt();
                            if (commandNumber == 1) {
                                shoppingCart.addCart(burgerArray, 3);
                                shoppingCart.cartAddMessage();
                            } else {
                                System.out.println("주문을 취소하셨습니다.");
                            }
                            break;

                        case 5:
                            purchasePage.purchaseMenu(burgerArray, 4);
                            purchasePage.purchasePageBasicForm();
                            commandNumber = scn.nextInt();
                            if (commandNumber == 1) {
                                shoppingCart.addCart(burgerArray, 4);
                                shoppingCart.cartAddMessage();
                            } else {
                                System.out.println("주문을 취소하셨습니다.");
                            }
                            break;
                    }
                    break;
                case 2:
                    frozenCustardPage.getBasicForm();
                    frozenCustardPage.getProductMenu(frozenCustardArray, frozenCustardSt);
                    commandNumber = scn.nextInt();
                    switch (commandNumber) {
                        case 1:
                            purchasePage.purchaseMenu(frozenCustardArray, 0);
                            purchasePage.purchasePageBasicForm();
                            commandNumber = scn.nextInt();
                            if (commandNumber == 1) {
                                shoppingCart.addCart(frozenCustardArray, 0);
                                shoppingCart.cartAddMessage();
                            } else {
                                System.out.println("주문을 취소하셨습니다.");
                            }
                            break;
                        case 2:
                            purchasePage.purchaseMenu(frozenCustardArray, 1);
                            purchasePage.purchasePageBasicForm();
                            commandNumber = scn.nextInt();
                            if (commandNumber == 1) {
                                shoppingCart.addCart(frozenCustardArray, 1);
                                shoppingCart.cartAddMessage();
                            } else {
                                System.out.println("주문을 취소하셨습니다.");
                            }
                            break;
                    }
                    break;
                case 3:
                    drinkPage.getBasicForm();
                    drinkPage.getProductMenu(drinkArray, drinkPageSt);
                    commandNumber = scn.nextInt();
                    switch (commandNumber) {
                        case 1:
                            purchasePage.purchaseMenu(drinkArray, 0);
                            purchasePage.purchasePageBasicForm();
                            commandNumber = scn.nextInt();
                            if (commandNumber == 1) {
                                shoppingCart.addCart(drinkArray, 0);
                                shoppingCart.cartAddMessage();
                            } else {
                                System.out.println("주문을 취소하셨습니다.");
                            }
                            break;
                        case 2:
                            purchasePage.purchaseMenu(drinkArray, 1);
                            purchasePage.purchasePageBasicForm();
                            commandNumber = scn.nextInt();
                            if (commandNumber == 1) {
                                shoppingCart.addCart(drinkArray, 1);
                                shoppingCart.cartAddMessage();
                            } else {
                                System.out.println("주문을 취소하셨습니다.");
                            }
                            break;
                        case 3:
                            purchasePage.purchaseMenu(drinkArray, 2);
                            purchasePage.purchasePageBasicForm();
                            commandNumber = scn.nextInt();
                            if (commandNumber == 1) {
                                shoppingCart.addCart(drinkArray, 2);
                                shoppingCart.cartAddMessage();
                            } else {
                                System.out.println("주문을 취소하셨습니다.");
                            }
                            break;
                        case 4:
                            purchasePage.purchaseMenu(drinkArray, 3);
                            purchasePage.purchasePageBasicForm();
                            commandNumber = scn.nextInt();
                            if (commandNumber == 1) {
                                shoppingCart.addCart(drinkArray, 3);
                                shoppingCart.cartAddMessage();
                            } else {
                                System.out.println("주문을 취소하셨습니다.");
                            }
                            break;
                    }
                    break;

                case 4:
                    beerPage.getBasicForm();
                    beerPage.getProductMenu(beerArray, beerPageSt);
                    commandNumber = scn.nextInt();
                    switch (commandNumber) {
                        case 1:
                            purchasePage.purchaseMenu(beerArray, 0);
                            purchasePage.purchasePageBasicForm();
                            commandNumber = scn.nextInt();
                            if (commandNumber == 1) {
                                shoppingCart.addCart(beerArray, 0);
                                shoppingCart.cartAddMessage();
                            } else {
                                System.out.println("주문을 취소하셨습니다.");
                            }
                            break;
                            case 2:
                                purchasePage.purchaseMenu(beerArray, 1);
                                purchasePage.purchasePageBasicForm();
                                commandNumber = scn.nextInt();
                                if (commandNumber == 1) {
                                    shoppingCart.addCart(beerArray, 1);
                                    shoppingCart.cartAddMessage();
                                } else {
                                    System.out.println("주문을 취소하셨습니다.");
                                }
                                break;
                                case 3:
                                    shoppingCart.addCart(beerArray, 2);
                                    purchasePage.purchaseMenu(beerArray, 2);
                                    purchasePage.purchasePageBasicForm();
                                    commandNumber = scn.nextInt();
                                    if (commandNumber == 1) {
                                        shoppingCart.addCart(beerArray, 2);
                                        shoppingCart.cartAddMessage();
                                    } else {
                                        System.out.println("주문을 취소하셨습니다.");
                                    }
                                    break;
                            }
                            break;
                    case 5:
                        orderPage.getOrderPageBasicForm();
                        orderPage.getCartProduct(shoppingCart);
                        orderPage.getLastForm();
                        commandNumber = scn.nextInt();
                        if(commandNumber == 1){
                            orderCompletePage.getOrderCompletePageBasicForm();
                            orderCompletePage.getOrderCompletePageLastForm();
                            shoppingCart.resetCart();
                            break;
                        }else if(commandNumber ==2){
                            break;
                        }
                    case 6:
                        orderCancelPage.getOrderCancelPageBasicForm();
                        commandNumber = scn.nextInt();
                        if (commandNumber == 1){
                            shoppingCart.resetCart();
                            orderCancelPage.getOrderCancleMessage();
                            break;
                        }else if(commandNumber==2){
                            break;
                        }

                    }


            }
        }
    }
