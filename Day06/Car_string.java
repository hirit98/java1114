package Day06;

public class Car_string {

    // 자동차 이름
    private String carName;
    // 자동차 브랜드
    private String company;

    // 인스턴스 생성할 때 차량 이름과 브랜드를 초기화 하는 오버로딩을 만든다.
    public Car_string(String carName, String company) {
        this.carName = carName;
        this.company = company;
    }

    // toString() 오버라이딩 클래스.toString() -> 차량이름 이름 : 소나타, 제조사 : 현대

    public String toString() {
        return "차량이름 : "+carName+", 제조사 : "+company;
    }
}
