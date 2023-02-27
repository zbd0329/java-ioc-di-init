package step1.order;

public class Order {
    //필드 부분 매개변수
    private String foodName;
    private int price;
    private int amount;

    //생성자를 통해서 초기화


    public Order(String foodName, int price, int amount) {
        this.foodName = foodName;
        this.price = price;
        this.amount = amount;
    }

    //private 제어자로 되어있기 때문에 getter 메서드를 만들어준다.
    //getter의 역할은?


    public String getFoodName() {
        return foodName;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}

//우리가 주문을 하나 받으면 그 주문을 orderList에 저장을 해야하기 때문에 매칭시스템이 필요하다.
//주문 하나랑 매칭이 되는 클래스

