package step1.app;

import step1.enums.Menu;
import step1.service.ChickenService;
import step1.service.PizzaService;

public class OrderApplication implements Consumer{ //커멘트 n을 누르고 오버라이드 선택
    //현재 피자와 치킨 둘중 어떤게 들어올지 모르는 상황이다
    private ChickenService chickenService = new ChickenService(); //이렇게 적는다고해도 지금 당장 구분할 수 있는 방법이 당장에는 없다.
    private PizzaService pizzaService = new PizzaService();

    //피자와 치킨을 포함관계로 넣어주는 이유 : 오더 어플리케이션이 고객이 처음 접근하는 어플이다(출구 겸 입구)
    //오더 어플리케이션은 주문을 받고 주문을 넘겨주는 역할만 한다.
    //실제로 그 주문을 받아서 저장을 하는 로직을 구현하는 곳은 서비스 부분이다.

    @Override
    public void chickenOrder(Menu menu, int amount) {
        chickenService.saveOrder(menu, amount); //알트 쉬프트 엔터를 누르면 해당하는 파라미터가 자동으로 들어가져 있는 메서드를 만들어준다.

    }

    @Override
    public void pizzaOrder(Menu menu, int amount) {
        pizzaService.saveOrder(menu, amount);

    }
}
