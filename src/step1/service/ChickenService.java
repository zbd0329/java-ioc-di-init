package step1.service;


import step1.enums.Menu;
import step1.order.Order;
import step1.order.OrderList;

public class ChickenService {

    //서비스에서는 이제 받아온 주문을 저장해야 한다. 데이터 대신에 오더리스트를 만들어 뒀기 때문에 오더리스트와 연결을 해준다.
    private final OrderList orderList = new OrderList("치킨"); //포함관계로 포함을 시킨다. 사용할 수 있게끔 인스턴스 선언.

    public void saveOrder(Menu menu, int amount) { //알트쉬프트엔터 단축키로 만든 메서드
        System.out.println("치킨 주문 저장");
        Order order = new Order(menu.getFoodName(), menu.getPrice(), amount); //받아온 주문을 오더클래스를 사용해서 객체로 만들어야 한다.
        //우리가 가져온 주문 하나를 오더 클래스 인스턴스 하나로 만들었다.
        //setOrderList를 통해서 자료를 넣어준다.
        orderList.setOrderList(order);


    }
}

//치킨 주문 저장

