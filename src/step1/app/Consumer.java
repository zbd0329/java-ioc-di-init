package step1.app;

import step1.enums.Menu;

public interface Consumer {
    void chickenOrder(Menu menu, int amount); //메소드
    void pizzaOrder(Menu menu, int amount); //메소드

}
