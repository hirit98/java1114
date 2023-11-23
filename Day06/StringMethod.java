package Day06;

public class StringMethod {
    public static void main(String[] args) {

        // String 클래스(java.lang) : charAt() 메서드
        // 문자열을 하나의 단어 단위로 출력

        String word = "1I2LOVE6YOU";

        // 문자열에서 숫자를 찾아 제거 하고 문자만 출력
        String text = "";

        //System.out.println(word.length());
        // length() : 문자열 길이를 반환 해당 문자열의 길이를 반환하는 메서드 통해서 word: 11 문자열

        for(int i=0;i<word.length();i++){
            // charAt() : String 을 char[] 글자가 하나가 들어가는 캐릭터 하나의 문자로 반환
            char ch = word.charAt(i);
            int asciNum = ch;

            // a~z = 97~122 / A~Z = 65~90
            if((asciNum >=65 && asciNum <=90) || (asciNum >=97 && asciNum <=122)) {
                text += ch;
            } else {
                text += " ";
            }
        }

        System.out.println(text);

        // indexOf() 메서드 : 문자열에 포함 된 단어 또는 문자열의 위치를 검색 했을때 위치의 인덱스 값을 반환

        String strIndex = "HelloWorld_MyWorld";

        // 처음 World 가 등장하는 index 번호를 알고싶음
        System.out.println(strIndex.indexOf("World"));

        System.out.println(strIndex.indexOf("World", 10));

        // replaceAll(변경 대상, 변경할 단어) : 변경 대상을 변경 할 단어로 모두 바꿔준다.

        String str = "자바 프로그래밍은 어렵지만 자바를 배울수록 재밌어요.";

        String newStr = str.replaceAll("자바", "Java");
        System.out.println(str);
        System.out.println(newStr);

        // substring() : 원하는 위치에 문자열을 잘러서 사용하는 메서드
        String subStr = "1234-5678";
        String subStr_ = subStr.substring(5);
        System.out.println(subStr_);

        String rangeStr = subStr.substring(0,4);
        System.out.println(rangeStr);

        // split() : 문자를 배열로 구분해서 잘라준다.

        String subStr2 = "1234-5678";
        String[] phone = subStr2.split("-");

        System.out.println(phone[0]);
        System.out.println(phone[1]);

        int num = -100;

        System.out.println((int)Math.signum(num));
        System.out.println((int)Math.signum(0));
        System.out.println((int)Math.signum(10));

        // StringBuffer / StringBuilder

        StringBuilder build_str = new StringBuilder("Hello");
        build_str.append("World");
        System.out.println(build_str);

        System.out.println(build_str.length());

        // 문자열 삭제

        build_str.delete(0,5);
        System.out.println(build_str);

        // 문자열 추가

        build_str.insert(0,"Hello");
        System.out.println(build_str);

        // 문자열 반전
        build_str.reverse();
        System.out.println(build_str);

    }
}
