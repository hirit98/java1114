import java.io.*;
import java.util.Scanner;

public class DisplayInfo {
    public static void main(String[] args) {

        // csv 파일을 읽는 경로주소를 변수명으로 지정.
        String strFilename = "src/twograde.csv";
        // 상대경로 : src 경로/파일명.csv
        // 절대경로 : C:\Users\User\IdeaProjects\SBS_Labs\src

        // BufferedReader 이용해서 twograde.csv 파일을 불러온다.
        try { // 일반 예외처리 try-catch 강제적 명시상태.
            Reader reader = new InputStreamReader(new FileInputStream(strFilename),"euc-kr");
            BufferedReader br = new BufferedReader(reader);

            try { // 파일을 전체적으로 읽어서 데이터가 몇개 인지 파악한다.
                String strTemp; // 파일의 필드에 해당하는 부분을 분리하기 위해서 사용하는 변수.
                int nLine = 0;
                while ((strTemp = br.readLine()) != null) {
                    nLine++;
                }
                //System.out.println(nLine);
                br.close();
                reader.close();

                int nStudent = nLine - 1; // 필드를 하나 뺀 전체 행의 정확 한 갯수를 정의.

                // GIS 배열을 학생수 만큼 생성한다.
                GIS[] oneStudent = new GIS[nStudent];

                // Scanner 를 사용해 파일을 다시 읽어내면서 한 줄 단위를 ',' 기준으로 열 단위 필드를 배열로 생성한다.

                FileInputStream fin = new FileInputStream(strFilename);
                Scanner sc = new Scanner(fin); // 파일을 스트림 단위로 입력받는 Scanner

                strTemp = sc.nextLine(); // 제목 부분을 그냥 읽고 지나가게 수정한다.

                // 구분자를 ','로 지정하고 한 줄 읽고 그 값을 저장 할 배열을 선언한다.
                String csvSplitBy = ",";
                String[] strLineArray; // 한줄을 ','로 구분하고 배열로 분리하는 변수

                // 파일을 다시 읽어 GIS[] 배열 객체 요소에 학과, 학년, 학번, 성명, 주소, 이메일을 할당한다.
                for(int i = 0; i <=28;i++) {
                    // Scanner 를 next 시킨다.
                    if(sc.hasNextLine()){ // sc에 행 단위 값이 존재 한다면
                        // 학과, 학년, 학번, 성명, 주소, 이메일로 저장한다.
                        strTemp = sc.nextLine();
                        strLineArray = strTemp.split(csvSplitBy);

                        String strDepartment = strLineArray[0]; // 학과
                        String nGrade = strLineArray[1]; // 학년
                        String strId = strLineArray[2]; // 학번
                        String strName = strLineArray[3]; // 성명
                        String strAddress = strLineArray[4]; // 주소
                        String strEmail = strLineArray[5]; // 이메일

                        System.out.println(strDepartment);
                        System.out.println(nGrade);
                        System.out.println(strId);
                        System.out.println(strName);
                        System.out.println(strAddress);
                        System.out.println(strEmail);

                        // 객체 배열에 담기

                        oneStudent[i] = new GIS(nGrade, strId, strName, strAddress, strEmail);
                        oneStudent[i].SetDepartment(strDepartment);

                    }
                }

                // 스트림 닫기
                sc.close();
                fin.close();

            }catch (Exception e){

            }
        } catch (Exception e){
            System.out.println("파일을 찾을 수 없습니다.");
        }


    }
}
