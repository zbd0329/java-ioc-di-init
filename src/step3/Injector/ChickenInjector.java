package step3.Injector;

import step3.order.OrderList;
import step3.service.ChickenService;
import step3.service.OrderService;

//구현체이기 때문에 포함을 시켜준다. 임플리먼트
public class ChickenInjector implements MenuInjector {

    @Override
    public OrderService getService() {
        return new ChickenService(new OrderList("치킨","사라","1234"));
    }
}