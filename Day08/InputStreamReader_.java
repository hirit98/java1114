package Day08;

import java.io.FileReader;
import java.io.Reader;

public class InputStreamReader_ {
    public static void main(String[] args) {

        // Reader -> InputStream/ FileReader

        // 파일 읽어오는 read 선언
        int read = 0;
        Reader reader = null;
        // Stream 선언
        char[] buffer = new char[256];
        try {
            reader = new FileReader("src/Day08/file_korean.txt");
            while(true) {
                read = reader.read(buffer);
                if(read == -1) {
                    break;
                }
                System.out.println(String.valueOf(buffer, 0,read));
            }
            reader.close();
        }catch (Exception e){
            System.out.println("Error : "+ e.getMessage());
        }

    }
}
