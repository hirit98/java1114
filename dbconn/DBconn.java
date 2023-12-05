package dbconn;

import java.sql.*;
import java.util.Scanner;

public class DBconn {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String dbDriver = "org.mariadb.jdbc.Driver";	// DB 드라이버 설정
		String dbURL = "jdbc:mariadb://localhost:23306/jdbc";	// DB URL 설정
		String id = "root"; // 계정 설정
		String password = "1234";
		Connection conn = null;	// DB 실행
		PreparedStatement pstmt = null;
		
		// Scanner 선언 : select Rows()
		
		Scanner sc = new Scanner(System.in);
		try {
			// 내부적으로 데이터베이스 드라이버 로드
			Class.forName(dbDriver);
			conn = DriverManager.getConnection(dbURL,id,password);
			
			if(conn != null) {
				System.out.println("DB 연결완료\n");
				
				// SQL 작성
				String query = "SELECT * FROM jdbc.student_info";
				
				// 데이터 문서 객체를 만들어서 전달
				Statement st = conn.createStatement();
				
				ResultSet res = st.executeQuery(query);
				
				while(res.next()) {
					
					System.out.println("학생 번호: "+res.getString("std_id"));
					System.out.println("학생 이름: "+res.getString("std_name"));
					System.out.println("학생 나이: "+res.getInt("std_age"));
					System.out.println("학생 학년: "+res.getInt("std_grade"));
					System.out.println("학생 성별: "+res.getString("std_gender"));
					System.out.println("학생 번호: "+res.getString("std_phone"));
					
					System.out.println();
					
				}
				
			}
			
	
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				// scan 닫기
					if(sc!=null) sc.close();
					
				// pstmt 닫기
					if(pstmt !=null) pstmt.close();
					
				// conn 닫기
					if (conn !=null) conn.close();
					
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		
	}

}
