package Day09;

public interface Comparable { // 비교 할 수 있는 인터페이스 -> 메인 메서드

    int compare(String a, String b);
}

interface CompareNumber{
    int compareTo(int num01, int num02);
}
