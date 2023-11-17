public class Home {
    // 객체 변수를 만든다 -> interface 를 활용한 익명 자식 객체
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("Tv를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("Tv를 끕니다.");
        }
    };
    // method use1
    public void use1() { // 객체 대입 변수를 이용 -> 익명 자식 객체를 만든다.
        // TV 를 켭니다. -> 익명 자식 객체를 통해서 메서드 생성 : turnOn()
        rc.turnOn();
        // TV 를 끕니다. -> 익명 자식 객체 : turnOff()
        rc.turnOff();
    }


    // method use2
    public void use2() {
        // 자체적인 변수를 만들어서 익명 객체를 선언한다.
        RemoteControl rc2 = new RemoteControl() {
            @Override
            public void turnOn() { // 에어컨을 켭니다.
                System.out.println("에어컨을 켭니다.");
            }

            @Override
            public void turnOff() { // 에어컨을 끕니다.
                System.out.println("에어컨을 끕니다.");
            }
        };

        // 객체변수를 호출
        rc2.turnOn();
        rc2.turnOn();
    }

    public void use3(RemoteControl rc2) {
        rc2.turnOn();
        rc2.turnOff();
    }
}

interface RemoteControl{
    void turnOn();
    void turnOff();
}

interface ResetButton {

}