package step1.enums;

public enum Menu {
    Chicken("치킨", 30000),
    Pizza("피자",50000),
    ;

    private String foodName; //접근제어자 사용
    private int price;

    Menu(String foodName, int price) { //생성자

        this.foodName = foodName;
        this.price = price;
    }

    public String getFoodName() { //정보를 가져오려면 게터가 필요하다
        return foodName;
    }

    public int getPrice() {
        return price;
    }
}
//메뉴를 이넘타입으로 관리를 하는 것이다.
