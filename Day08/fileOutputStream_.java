package Day08;

import java.io.*;

public class fileOutputStream_ {
    public static void main(String[] args) {

        InputStream in = null;
        OutputStream out = null;
        try {
            out = new FileOutputStream("src/Day08/write.txt", true); // true : 이어쓰기 / false : 새로 만들기
            out.write('H');
            out.write('E');
            out.write('L');
            out.write('L');
            out.write('O');
            out.write(' ');
            out.write('W');
            out.write('O');
            out.write('R');
            out.write('L');
            out.write('D');

            in = new FileInputStream("src/Image/naver.png"); // 복사할 사진 파일을 읽어온다.
            // 읽어온 파일을 복사한다. -> 쓴다 -> 저장한다.
            out = new FileOutputStream("src/Image/naver_copy.jpg");
            //byte[] buffer = new byte[512];

            // 파일을 복사 할 시간 단위를 만들어서 얼마나 걸리는지 알아본다.
            long start = System.currentTimeMillis();
            System.out.println("이미지 읽기 시작!");

            int read = 0;
            while ((read = in.read(/*buffer*/)) != -1) {
                //out.write(buffer, 0,read);
                out.write(read);
            }

            System.out.println("이미지 읽기 종료!");

            long end = System.currentTimeMillis();
            // start - end 해서 총 걸린 시간 구하기.
            double time = (double)(end - start);
            System.out.println("총 걸린 시간은 "+time+"초 입니다");

        }catch(Exception e) {
            System.out.println("Error : "+e.getMessage());
        }

    }
}
