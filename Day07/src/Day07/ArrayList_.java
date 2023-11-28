package Day07;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ {
    public static void main(String[] args) {

        // -ArrayList
        // -add: 추가 / set: 변경 / remove: 삭제
        // List 선언
        List<String> list =  new ArrayList<>();

        // 리스트 내용1: [딸기, 바나나, 망고]
        list.add("딸기");
        list.add("바나나");
        list.add("망고");
        System.out.println("list 내용1: "+list);

        list.add(2,"수박");
        // 추가 - index 2번째 공간에 "수박"을 추가
        // 리스트 내용2: [딸기, 바나나, 수박, 망고]
        System.out.println("list 내용2: "+list);

        List<String> list2 = new ArrayList<>();
        list2.add("수박");
        list2.add("바나나");
        list2.add("망고");

        System.out.println("list2 내용1: "+list2);
        // 리스트 내용2: [딸기, 복숭아, 망고]
        list2.set(1,"복숭아");
        list2.set(2,"애플망고");
        System.out.println("list2 내용2: "+list2);
    }
}
