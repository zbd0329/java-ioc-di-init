package step1;


import step1.app.Consumer;
import step1.app.OrderApplication;
import step1.enums.Menu;
import step1.order.Order;
import step1.order.OrderList;

public class Main {
    public static void main(String[] args) {
        Consumer consumer;
        //고객이 어플리케이션을 실행시키려면 구현체가 필요하다. new OrderApplication();

        //치킨 주문
        consumer = new OrderApplication();
        consumer.chickenOrder(Menu.Chicken,2);
        consumer.chickenOrder(Menu.Chicken,4);
        consumer.chickenOrder(Menu.Chicken,10);

        //주문 확인
        OrderList orderList = new OrderList("치킨");
        for (Order order : orderList.getOrderList()) { //iter사용하여 자동세팅
            System.out.println(order.getFoodName());
            System.out.println(order.getPrice());
            System.out.println(order.getAmount());
            System.out.println();
        }

        //피자 주문
        consumer.pizzaOrder(Menu.Pizza,3);
        consumer.pizzaOrder(Menu.Pizza,4);
        consumer.pizzaOrder(Menu.Pizza,1);

        //주문 확인
        orderList = new OrderList("피자");
        for (Order order : orderList.getOrderList()) {
            System.out.println(order.getFoodName());
            System.out.println(order.getPrice());
            System.out.println(order.getAmount());
            System.out.println();


        }
    }
}

//여기는 고객이 실제로 주문하는 공간
//우리 자바 어플리케이션은 main 메서드 static void에서 시작이 된다. 여기가 시작점이자 끝점이다.
//iter 은 포맷을 자동으로 만들어주는 기능이다
