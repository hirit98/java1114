
public class main_20231117 {
    public static void main(String[] args) {

        // Ok 버튼 객체 생성.
        Button btnOk = new Button();

        /*class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼 활성화");
            }
        }*/

        // button 객체에 ClickListener 객체 주입 인스턴스 메서드 호출
        btnOk.setClickListener(new Button.ClickListener(){

            @Override
            public void onClick() {
                System.out.println("Ok 버튼 활성화");
            }
        });
        // button 객체 있는 실제로 버튼이 클릭되는 이벤트 메서드 호출
        btnOk.click();

        // Cancle 버튼 객체 생성.
        Button btnCancle = new Button();

        /*class CancleListener implements Button.ClickListener{

            @Override
            public void onClick() {
                System.out.println("Cancle 버튼 활성화");
            }
        }*/

        btnCancle.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Cancle 버튼 활성화");
            }
        });
        btnCancle.click();

        // Car 객체 생성.
        Car c1 = new Car();
        c1.run1();
        c1.run2();

        // 익명 자식 객체가 대입 된 매개변수를 사용
        // method-> run3() 를 만들어서 main 함수 안에서 재정의
        // car.method(Tire tire(roll() {System.out.println("익명3")})
        c1.run3(new Tire(){
            public void roll(){
                System.out.println("익명 자식 객체 3이 굴러갑니다.");
            }
        });

        // Home 인스턴스 생성
        Home hm = new Home();
        // Home.use1 호출
        hm.use1();
        // Home.use2 호출
        hm.use2();

        hm.use3(new RemoteControl(){

            @Override
            public void turnOn() {
                System.out.println("전등 센서를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("전등 센서를 끕니다.");
            }
        });
    }

}
