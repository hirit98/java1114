public class Button {
    public static interface ClickListener { // 중첩 인터페이스
        void onClick();
    }

    // 객체 변수를 만든다.
    ClickListener clickListener;

    // 객체 주입: 등록(OK) / 취소(Cancle)
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    // 버튼을 클릭하는 메서드 작성
    public void click() {
        this.clickListener.onClick();
    }


}
