package step2.app;


import step2.enums.Menu;
import step2.service.ChickenService;
import step2.service.OrderService;
import step2.service.PizzaService;

//오더 어플리케이션의 부함을 줄어주는 작업


public class OrderApplication implements Consumer {

    private final OrderService orderService;
    //생성자를 만들어서 의존성을 줄여주도록 해보자
    public OrderApplication(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void order(Menu menu, int amount) {
        orderService.saveOrder(menu, amount);
    }

    //    @Override
//    public void chickenOrder(Menu menu, int amount) {
//        chickenService.saveOrder(menu, amount);
//    }
//
//    @Override
//    public void pizzaOrder(Menu menu, int amount) {
//        pizzaService.saveOrder(menu, amount);
//    }
//    //두개를 나눌 필요가 없다.

}
