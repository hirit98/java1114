import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {
    public static void main(String[] args) {
        // 두가지 다중 catch 를 만들어 본다.
        // 정수형 배열을 만든다. cards = {4,5,1,2,7,8}

        Scanner sc = new Scanner(System.in);

        int[] cards = {4,5,1,2,7,8};

        try {
            System.out.print("몇번 째 카드를 뽑으시겠습니까? >> ");

            int CardIndex = sc.nextInt();
            System.out.println("뽑은 카드 번호는 : "+cards[CardIndex]);
        }catch (InputMismatchException e) {
            // InputMismatchException : 입력이 잘못 된 경우(scanner 에러) 예외처리
            System.out.println("잘못 입력하셨습니다(숫자만 가능).");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("0 부터 "+(cards.length-1)+"까지 입력하세요.");
        }

        System.out.println("프로그램 종료");
        sc.close();

    }
}
