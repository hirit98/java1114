package Day08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class subStream_ {
    public static void main(String[] args) {

        // 1) 성능 향상 보조 스트림
        // Input
        FileInputStream readFile = null; // 기반 스트림
        BufferedInputStream bis = null; // 보조 스트림

        // Output
        FileOutputStream writeFile = null;// 기반 스트림
        BufferedOutputStream bos = null;

        System.out.println("보조 스트림 시작");
        try{
            readFile = new FileInputStream("src/Image/naver.png"); // 파일의 위치에서 스트림을 시작하는 경로 지정
            writeFile = new FileOutputStream("src/Image/naver_sub.jpg");

            // 보조 스트림으로 결합
            bis = new BufferedInputStream(readFile);
            bos = new BufferedOutputStream(writeFile);

            long start = System.currentTimeMillis();

            while((bis.read()) != -1) {
                bos.write(bis.read());
            }

            long end = System.currentTimeMillis();

            double time = (double)(end - start);
            System.out.println("걸린시간 : "+time+"초.");


        }catch (Exception e) {
            System.out.println("Error : "+e.getMessage());
        }

        // 보조 스트림
    }
}
