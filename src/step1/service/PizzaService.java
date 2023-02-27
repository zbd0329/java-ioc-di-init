package step1.service;


import step1.enums.Menu;
import step1.order.Order;
import step1.order.OrderList;


public class PizzaService {

    private final OrderList orderList = new OrderList("피자");

    public void saveOrder(Menu menu, int amount) { //알트쉬프트엔터 단축키로 만든 메서드
        System.out.println("피자 주문 저장");
        Order order = new Order(menu.getFoodName(), menu.getPrice(), amount); //받아온 주문을 오더클래스를 사용해서 객체로 만들어야 한다.
        //우리가 가져온 주문 하나를 오더 클래스 인스턴스 하나로 만들었다.
        //setOrderList를 통해서 자료를 넣어준다.
        orderList.setOrderList(order);

    }

}

//피자 주문 저장