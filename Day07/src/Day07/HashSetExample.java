package Day07;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        Set<TextMessage> msgSet = new HashSet<>();

        // TextMessage 생성 -> 인스턴스 -> 클래스의 공간을 HashSet(중복 체크)

        // 메시지 객체 생성
        TextMessage msg1 = new TextMessage(1001, "안녕하세요");
        TextMessage msg2 = new TextMessage(1001, "안녕하세요");
        TextMessage msg3 = new TextMessage(1001, "안녕하세요");
        TextMessage msg4 = new TextMessage(1002, "안녕하세요");
        TextMessage msg5 = new TextMessage(1003, "안녕");

        // Set 추가: 인스턴스화 시킨 객체를 따로 추가해서 Set 자료구조 각각 저장한다.
        msgSet.add(msg1);
        msgSet.add(msg2);
        msgSet.add(msg3);
        msgSet.add(msg4);
        msgSet.add(msg5);
        // 저장 된 크기 확인: Set 자료구조의 저장 크기를 알기위해 size() 메서드 사용.
        System.out.println("사이즈: "+msgSet.size());
        // 출력: for 문 이용해서 자료구조를 탐색해서 출력한다. (Foreach -> 배열이나 구조화 된 공간 값을 한꺼번에 정의해서 꺼냄.)

        for(TextMessage msg: msgSet) {
            System.out.println("번호: "+msg.getMsgNumber()+", 메시지: "+msg.getMsg());
        }

        // 데이터 삭제
        msgSet.remove(msg5);
        System.out.println("사이즈: "+msgSet.size());
        for(TextMessage msg: msgSet) {
            System.out.println("번호: "+msg.getMsgNumber()+", 메시지: "+msg.getMsg());
        }
    }
}
