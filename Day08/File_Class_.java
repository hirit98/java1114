package Day08;

import java.io.File;

public class File_Class_ {
    public static void main(String[] args) {

        File f = new File("src/Image/naver.png");

        if((f.exists())) { // 파일이 존재하는지 확인
            System.out.println("length : "+f.length()); // length() : 파일 크기

            System.out.println("CanRead : "+f.canRead());// canRead() : 읽기가 가능한지

            System.out.println("getName : "+f.getName()); // getName() : 파일의 확장명과 이름을 가져온다

            System.out.println("getParent : "+f.getParent()); // getParent() : 파일의 경로를 불러온다

            System.out.println("getPath : "+f.getPath()); // getPath() : 전체 경로를 불러온다
        }

    }
}
