package step2.service;

import step2.enums.Menu;

//인터페이스를 만들때는 구현체들을 생각해야 한다.
//pizzaService와 ChickenService는 saveOrder를 공통적으로 가지고 있다.
public interface OrderService {
    void saveOrder(Menu menu, int amount);
}
