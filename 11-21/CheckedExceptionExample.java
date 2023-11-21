import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        // 일반 예외: 입/출력 오류 (체크 될 상황이 강제적.)
        BufferedReader reader = null;
        try {
            // 입출력 코드는 에러 처리가 일반 예외처리.
            reader = new BufferedReader(new FileReader("example.txt"));
        }catch(IOException e){
            e.printStackTrace();
        }finally {

            // finally 안에도 try-catch 를 넣을 수 있다.
            try {
                // reader 입출력 버퍼가 있는 경우 버퍼를 닫는다.
                if(reader != null) {
                    reader.close();
                }
            }catch (IOException e){
                // reader 입출력 버파가 없는 경우는 다시 에러코드를 발생시켜 확인한다.
                e.printStackTrace();
            }

        }

    }
}
