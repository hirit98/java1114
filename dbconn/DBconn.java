package dbconn;

import java.sql.*;
import java.util.Scanner;

public class DBconn {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String dbDriver = "org.mariadb.jdbc.Driver";	// DB ����̹� ����
		String dbURL = "jdbc:mariadb://localhost:23306/jdbc";	// DB URL ����
		String id = "root"; // ���� ����
		String password = "1234";
		Connection conn = null;	// DB ����
		PreparedStatement pstmt = null;
		
		// Scanner ���� : select Rows()
		
		Scanner sc = new Scanner(System.in);
		try {
			// ���������� �����ͺ��̽� ����̹� �ε�
			Class.forName(dbDriver);
			conn = DriverManager.getConnection(dbURL,id,password);
			
			if(conn != null) {
				System.out.println("DB ����Ϸ�\n");
				
				// SQL �ۼ�
				String query = "SELECT * FROM jdbc.student_info";
				
				// ������ ���� ��ü�� ���� ����
				Statement st = conn.createStatement();
				
				ResultSet res = st.executeQuery(query);
				
				while(res.next()) {
					
					System.out.println("�л� ��ȣ: "+res.getString("std_id"));
					System.out.println("�л� �̸�: "+res.getString("std_name"));
					System.out.println("�л� ����: "+res.getInt("std_age"));
					System.out.println("�л� �г�: "+res.getInt("std_grade"));
					System.out.println("�л� ����: "+res.getString("std_gender"));
					System.out.println("�л� ��ȣ: "+res.getString("std_phone"));
					
					System.out.println();
					
				}
				
			}
			
	
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				// scan �ݱ�
					if(sc!=null) sc.close();
					
				// pstmt �ݱ�
					if(pstmt !=null) pstmt.close();
					
				// conn �ݱ�
					if (conn !=null) conn.close();
					
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		
	}

}
