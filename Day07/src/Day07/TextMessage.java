package Day07;

public class TextMessage {
    // 메시지를 식별하는 번호
    private int msgNumber; // 메시지 식별번호
    private String msg; // 메시지 내용

    public TextMessage(int msgNumber, String msg) {
        this.msgNumber = msgNumber;
        this.msg = msg;
    }

    // 메서드를 활용해서 private 에 접근한다.
    public int getMsgNumber() {
        return msgNumber;
    }
    public String getMsg() {
        return msg;
    }

    public int hashCode() {
        // 식별 번호 return
        return msgNumber;
    }

    // equals: 동등비교 == 동등비교(주소=주소) || equals()
    // 내용을 식별 할 수 있는 메서드 재정의 해서 만든다.
    // @Override
    public boolean equals(Object obj) {
        if(obj instanceof TextMessage){ // TextMessage 클래스를 사용하는 인스턴스인지 확인한다.
            TextMessage compare = (TextMessage)obj;
            if(msg.equals(compare.getMsg())){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }

}
