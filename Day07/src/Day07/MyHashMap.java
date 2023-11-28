package Day07;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        // 데이터를 삽입
        map.put("spring", "봄");
        map.put("summer", "여름");
        map.put("fall", "가을");
        map.put("winter", "겨울");

        map.put("spring", "봄봄");
        // 데이터 삭제
        map.remove("winter");

        // 특정 Key 가 존재하는지 확인
        System.out.println("Is Exist Key: "+map.containsKey("winter"));
        // 특정 Key 존재확인 - 중복 신경쓰지 않는 확인
        System.out.println("Is Exist Value: "+map.containsValue("가을"));

        System.out.println("get Date: "+map.get("spring"));
    }
}
