package Day08;

import java.io.FileInputStream;
import java.io.InputStream;

public class fileInputStream_ {
    public static void main(String[] args) {

        // InputStream(입출력 최상위 객체) - fileInputStream : 파일에서 byte 단위로 자료를 읽는 기본 스트림

        // 파일을 읽어 올 변수
        int read = 0;

        byte[] buffer = new byte[5];
        // 스트림 선언
        InputStream in = null; // 최상위 클래스를 상속받을 수 있는 형 타입으로 선언
        // 파일 읽기
       try{
           in = new FileInputStream("src/Day08/my_file.txt"); // 상대경로로 파일을 불러옴.

           while(true){
               // 파일 읽기 시작.
               read = in.read(buffer);
               if(read == -1) { // 파일 끝 일때 -1 반환
                   break;
               }
               System.out.print(new String(buffer,0, read));
           }

       }catch (Exception e){
           System.out.println("Error : "+e.getMessage());
       } finally {
           try {
               if(in!=null){
                   in.close();
               }
           }catch (Exception e){
               System.out.println("Error : "+e.getMessage());
           }

       }


        // 파일의 끝지점 -1 반환 -> 파일 닫기
    }
}
