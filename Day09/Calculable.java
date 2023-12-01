package Day09;

public interface Calculable {

    // 람다식: 인터페이스
    double calculable(int x, int y);

}

interface Workable{
    void work();
}

class Person3{

    public void action(Workable workable) {
        workable.work();
    }
}

class Person4{
    public void action(Calculable calculable) {
        double result = calculable.calculable(10,4);

        System.out.println(result);
    }
}

class Computer2{
    // 클래스 : 인스턴스/ 클래스 메서드를 사용하는 방법으로 만든다.

    // 인스턴스 메서드
    public double instanceMethod(double x, double y){
        return x+y;
    }
    // 클래스 메서드
    public static double staticMethod(double x, double y) {
        return x+y;
    }
}