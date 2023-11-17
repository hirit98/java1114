public class Exception_ {
    public static void main(String[] args) {
        //1. NullPointerException : 객체를 선언하면 인스턴스 주소를 가지게 되지만 객체는 정의하면 실제 메모리가 없는 상태
        System.out.println("##########NullPointerException##########");

        String[] strArray = null;
        //System.out.println("strArray[0]: "+strArray[0]);

        //2. NumberFormatException : 잘못된 숫자로 형변환이 발생하거나 숫자 형태의 문자열은 정수타입으로 가능하나
        //실수형은 문자형으로 반환할 때 오류가 생김.
        System.out.println("##########NumberFormatException##########");

        String str01 = "11";
        String str02 = "11.0";
        int num1 = Integer.parseInt(str01);
        System.out.println("String int "+num1);
        //int num2 = Integer.parseInt(str02);

        //3. ArrayIndexOutOfBoundsException : 배열에서 인덱스 범위에서 초과할 때 발생하는 오류.
        System.out.println("##########ArrayIndexOutOfBoundsException##########");

        int[] arr = {1,3,5,7,9};
        //System.out.println(arr[6]);
    }

}
