public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        // 산술 연산자로 계산할 경우 산술이 잘못 된 처리를 해서 에러가 발생 된 경우
        int result = 0;
        /*result = 10/0;
        System.out.println(result);*/

        try {
            result = 10/0;
        }catch (ArithmeticException e){
            //e.printStackTrace();
            System.out.println(e+"\n0으로 나눌수 없다.");
        }finally {
            System.out.println("프로그램 종료");
        }
    }

}
