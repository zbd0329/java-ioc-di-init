package step3.Injector;

import step3.order.OrderList;
import step3.service.OrderService;
import step3.service.PizzaService;

public class pizzaInjector implements MenuInjector{
    @Override
    public OrderService getService() {
        return new PizzaService(new OrderList("피자", "Robbie", "1234"));
    }
}
