package step3.Injector;

import step3.service.OrderService;

//메뉴의 부담을 줄여줄 메뉴인젝터 생성
public interface MenuInjector {
    OrderService getService(); //오더 서비스를 반환하는 메서드
}


