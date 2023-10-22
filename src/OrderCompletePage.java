public class OrderCompletePage {
    int waitingCount=1;

    public void getOrderCompletePageBasicForm(){
        System.out.println("주문이 완료 되었습니다!");
    }

    public int getWaitingCount(){
        waitingCount++;
                return waitingCount;
    }
    public void getOrderCompletePageLastForm(){
        System.out.println("대기번호는 [" + waitingCount + "] 번 입니다.");
        System.out.println("(3초후 메뉴판으로 돌아갑니다.)");

        try{
            for (int i=0; i<2;i++){
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
