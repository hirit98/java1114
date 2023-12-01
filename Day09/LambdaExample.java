package Day09;

public class LambdaExample {
    public static void main(String[] args) {

        // 람다식 -> 클래스 메서드 -> action()
        // 이름이 없는 함수
        /*action((x,y) ->{
            int result = x+y;
            System.out.println("result : "+result);
        });

        action((x,y)-> {
            int result = x-y;
            System.out.println("result : "+result);
        });*/

        // 클래스 메소드 -> 인터페이스 클래스: 메서드 형식 호출

        // 매개변수가 없는 람다식 -> 클래스 인스턴스 매서드를 호출(인터페이스)->람다식이 구현한다.
        // Person3 클래스
        Person3 person = new Person3();
        // 실행문이 두가지가 있는 경우
        person.action(()->{
            System.out.println("출근을 합니다.");
            System.out.println("프로그래밍을 합니다");
        });
        // 실행문이 한가지 인 경우 -> 중괄호를 생략한다
        person.action(()-> System.out.println("퇴근을 합니다."));

        // return 이 있는 람다식
        Person4 person2 = new Person4();

        // 람다식에서 처리를 할 때 -> return 한 값-> 클래스가 반환 받는 방식
        person2.action((x,y)->{
            double result = x+y;
            return result;
        });

        // 실행문이 하나인 return 이 존재하는 람다식
        person2.action((x,y)-> (x+y));
        // return 이 있는 람다식: 실행문이 하나인 경우 구현부 처리방법을 -> 클래스 메서드를 통해서 해결
        person2.action((x,y)->sum(x,y));

        // 메서드 참조(정적메서드/ 인스턴스메서드)
        // 정적 메서드
        person2.action((x,y) -> Computer2.staticMethod(x,y));
        // 인스턴스 메서드
        Computer2 com = new Computer2();
        person2.action((x,y)-> com.instanceMethod(x,y ));
        person2.action(com::instanceMethod);
    }

    public static void action(Calculable calculable) { // 인터페이스 다형성을 매개변수로 받아야 클래스메서드에서 사용가능

        int x = 10;
        int y = 4;

        calculable.calculable(x, y); // x, y 선언부 구현
    }

    public static double sum(double x, double y) {
        return (x+y);

    }
}
