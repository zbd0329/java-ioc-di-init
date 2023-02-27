package step2.service;


import step2.enums.Menu;
import step2.order.Order;
import step2.order.OrderList;

public class PizzaService implements OrderService{ //implements로 포함관계 만들어주기

    private final OrderList orderList;

    public PizzaService(OrderList orderList) {
        this.orderList = orderList;
    } //생성자 주입

    @Override //포함관계에 있는 메소드 구체적으로 재정립
    public void saveOrder(Menu menu, int amount) {
        System.out.println("피자 주문 저장");
        Order order = new Order(menu.getFoodName(), menu.getPrice(), amount);
        orderList.setOrderList(order);
    }
}
