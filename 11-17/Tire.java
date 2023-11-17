public class Tire {
    public void roll() {
        System.out.println("일반 타이어가 굴러갑니다.");
    }
}

class Car{

    // 익명 구현 객체
    private Tire tire1 = new Tire();

    // 필드에 익명 자식 객체 대입 변수 = 객체(){ 메서드를 새롭게 구현  }
    private Tire tire2 = new Tire() {
        public void roll() {
            System.out.println("익명 자식 객체 1이 굴러갑니다.");
        }
    };

    // 메서드를 활용해서 tire1 과 tire2 를 호출.
    public void run1(){
        tire1.roll();
        tire2.roll();
    }

    // 메서드(로컬 변수 이용)
    public void run2() {
        // 로컬 변수에 익명 자식 객체 대입
        Tire tire2 = new Tire() {
            public void roll() {
                System.out.println("익명 자식 객체 2이 굴러갑니다.");
            }
        };
        tire2.roll();
    }

    public void run3(Tire tire2) {
        tire2.roll();
    }
}
