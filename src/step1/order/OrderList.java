package step1.order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderList {
    private String foodName; //들어온 주문이 치킨인지 피자인지 확인하기 위해서 음식의 이름을 받아온다.

    public OrderList(String foodName) {
        this.foodName = foodName; //받아온 음식의 이름은 생성자를 통해서 초기화를 해준다.
    }

    private static List<Order> orderList = new ArrayList<>(); //static으로 하는 이유는 static에 대한 이해가 필요하다 공통분모

    public void setOrderList(Order order) { //오더를 받아와서 오더로 넣어준다.
        orderList.add(order); //orderList.add메서드를 이용해서 우리가 받아온 order를 넣어주면 된다.
        System.out.println(foodName + "주문 저장 완료");
    }

    public List<Order> getOrderList() { //주문에 대해 가져올 수 있도록 하는 것
//        return null; (작업할때 일단 값을 null로 넣어주고 작업한 뒤 세부작업을 한다.)

        if(foodName.equals("치킨")) {
            return orderList.stream().filter(f -> f.getFoodName().equals("치킨")).collect(Collectors.toList());
            //스트림보다는 객체지향 먼저 보기
        } else if (foodName.equals("피자")) {
            return orderList.stream().filter(f -> f.getFoodName().equals("피자")).collect(Collectors.toList());
        } else {
            return orderList;
        }

    }

}

//오더 리스트에서는 주문들을 저장해줘야 한다.
//오더 정보를 넣어주기 위해 세터도 만들어 줘야 한다.
//저 리스트에 오더, 즉 주문을 넣어줘야 한다. 저 리스트에는 오더타입만 들어갈 수 있다.
//데이터베이스 대신 사용하는 클래