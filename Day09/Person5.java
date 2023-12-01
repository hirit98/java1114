package Day09;

public class Person5 {

    // 인스턴스 메서드를 활용해서 Comparable.compare() 추상 메서드를 묶어서 구현 방법을 만든다.

    public void ordering(Comparable comparable) {
        String a = "홍길동";
        String b = "고길동";

        int result = comparable.compare(a,b);

        if(result < 0){
            System.out.println(a+"은 "+b+"보다 앞에 옵니다.");
        }else if(result == 0){
            System.out.println(a+"과 "+b+"은 같습니다.");
        }else {
            System.out.println(a+"은 "+b+"보다 뒤에 옵니다.");
        }

    }
}
