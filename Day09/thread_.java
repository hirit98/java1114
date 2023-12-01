package Day09;

class WhiteFlag implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("백기 올려!");
        }
    }
}

class MyTask extends Thread implements Runnable {
    public MyTask() {
        setName("my-Task-1"); // 사용할 스레드의 이름을 정의 할 수 있다.
    }

    public void run() {
        String threadName = Thread.currentThread().getName();
        while (true) {
            System.out.println(threadName);
        }
    }
}

public class thread_ {
    public static void main(String[] args) {

        // 1. Runnable 이용해 스레드 만들기
        Thread write = new Thread(new WhiteFlag());
        //write.start(); // 스레드 시작

        // 2. 익명 클래스를 람다식 표현
        Runnable bluewrite = ()-> {
            while (true) {
                System.out.println("청기 올려!");
            }
        };

        Thread whiteFlag = new Thread(bluewrite);
        //whiteFlag.start();

        // 3. 스레드 이름을 부여한 멀티 스레드 만들기
        Thread myTask = new Thread(new MyTask());
        //myTask.start();


    }
}
