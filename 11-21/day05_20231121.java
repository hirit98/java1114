import java.util.InputMismatchException;
import java.util.Scanner;

public class day05_20231121 {
    // static method
    public static void CheckYourSelf(Scanner sc) throws InputMismatchException { // 숫자만 가능 한 경우
        System.out.println("1. 사람과 어울리는 것이 좋다.\n2. 혼자 있는 것이 좋다.");
        System.out.print("선택 : ");
        int check = sc.nextInt();
        if(check==1) {
            System.out.println("당신은 ENFP 입니다.");
        }else{
            System.out.println("당신은 ISFP 입니다.");
        }
    }
    public static void main(String[] args) {

        /*try {
            Exception e = new Exception("고의 발생");
            throw e;
        }catch (Exception e){
            System.out.println("에러 메시지 : "+e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료되었습니다.");*/

        // Scanner 로 문항을 주고 번호를 선택 받는다.
        Scanner sc = new Scanner(System.in);

        // "성격 유형 검사를 시작합니다.' 멘트를 프린트
        System.out.println("성격 유형 검사를 시작합니다.");

        try {
            //static 메서드를 활용해서 지문에 대한 문항을 검사하는 메서드를 만든다.
            day05_20231121.CheckYourSelf(sc); // scan 의 오류를 static 메서드에 던질 수 있게 매개변수로 만들어준다.
        }catch (InputMismatchException e){
            System.out.println("입력이 잘못 되었습니다. ");
        }finally {
            if(sc!=null){
                sc.close();
            }
        }
        System.out.println("프로그램 종료");
    }
}
