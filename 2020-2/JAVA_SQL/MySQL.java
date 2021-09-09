package JAVA_SQL;
import java.io.*;
import java.util.*;
import java.sql.*;

public class MySQL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");			// Register JDBC driver			
			System.out.println("Connecting to database...");	// Open a connection
			// db�̸�: mydb, db��й�ȣ: 0317
			conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "0317");	
			stmt = conn.createStatement();
			while (true) {
				System.out.println("========================================");
				System.out.println("(0) ����\n(1) �����̼� ���� �� ������ �߰�\n(2) ������ �̿��� �˻�");
				System.out.println("(3) �������� �̿��� �˻�\n(4) �������� �̿��� �˻�");
				System.out.println("========================================");
				System.out.print("���ϴ� ��ȣ �Է�: ");
				select = sc.nextInt();							// �ɼ� ����
		        switch (select) 
		        {
		        case 0: // ����
		        	System.out.println("���α׷��� �����մϴ�.");		// ���α׷� ����
		            sc.close();
		            stmt.close();
		            conn.close();
		            return;
		        case 1:	// �����̼� ���� �� ������ �߰�
		        	File file = new File("C:\\movie_data.txt");								// C����̺꿡 �ִ� movie_data.txt ������ ����
		            try (BufferedReader br = new BufferedReader(new FileReader(file))) {	// BufferedReader�� ���� ������ �����͸� ����
		            	String line;
		            	StringTokenizer st;
		            	while ((line = br.readLine()) != null) {							// �����͸� ���� ������ ���ڿ��� ����
		            		st = new StringTokenizer(line, "|");							// �־��� ���ڿ��� ��ū�� '|'�� �������� ������ ����
		            	    while(st.hasMoreTokens()) {
		            	    	try {														// �־��� �����͸� query���� ���� db�� ����
			            	    	stmt.executeUpdate("insert into movie values("+st.nextToken()+",'"+st.nextToken()+"','"+st.nextToken()+"','"+st.nextToken()+"','"+st.nextToken()+"',"+st.nextToken()+","+st.nextToken()+","+st.nextToken()+",'"+st.nextToken()+"')");
			            	    	} catch (SQLException sqle) {    						// �־��� ������ �Է� ������
			            	    		System.out.println("Could not insert tuple. " + sqle);
			            	    		}
		            	    }
		            	}
		            } catch (IOException e) {												// ����� ���� ��
		            	System.out.println("����� ����");
		            }
		            rs = stmt.executeQuery("SELECT * FROM movie");	// Execute a query
		            while(rs.next())	// Print results
                    	System.out.println("|"+rs.getString(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getDate(4)+"|"+rs.getString(5)+"|"+rs.getInt(6)+"|"+rs.getLong(7)+"|"+rs.getInt(8)+"|"+rs.getString(9));
                    System.out.println("�Է��� �Ϸ��߽��ϴ�.");
		            break;
		        case 2:	// ������ �̿��� �˻�
		        	System.out.print("����� �Է�: ");
					rs = stmt.executeQuery("SELECT * FROM movie WHERE title like '%"+sc.next()+"%'");	// Execute a query
					while(rs.next())	// Print results
                    	System.out.println("|"+rs.getString(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getDate(4)+"|"+rs.getString(5)+"|"+rs.getInt(6)+"|"+rs.getLong(7)+"|"+rs.getInt(8)+"|"+rs.getString(9));
                    System.out.println("�˻��� �Ϸ��߽��ϴ�.");
		            break;
		        case 3:	// �������� �̿��� �˻�
		        	System.out.print("����� �Է�: ");
					rs = stmt.executeQuery("SELECT * FROM movie WHERE totalnum > "+sc.next());	// Execute a query
					while(rs.next())	// Print results
                    	System.out.println("|"+rs.getString(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getDate(4)+"|"+rs.getString(5)+"|"+rs.getInt(6)+"|"+rs.getLong(7)+"|"+rs.getInt(8)+"|"+rs.getString(9));
                    System.out.println("�˻��� �Ϸ��߽��ϴ�.");
		            break;
		        case 4:	// �������� �̿��� �˻�
		        	System.out.print("����� �Է�: ");
					rs = stmt.executeQuery("SELECT * FROM movie WHERE releasedate >= '"+sc.next()+"' AND releasedate <= '"+sc.next()+"'");	// Execute a query
					while(rs.next())	// Print results
                    	System.out.println("|"+rs.getString(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getDate(4)+"|"+rs.getString(5)+"|"+rs.getInt(6)+"|"+rs.getLong(7)+"|"+rs.getInt(8)+"|"+rs.getString(9));
                    System.out.println("�˻��� �Ϸ��߽��ϴ�.");
		            break;
		        default:	// ���� �� ���ڸ� �Է�������
		            System.out.println("�߸� �Է��ϼ̽��ϴ�. (0 ~ 4)");
		            continue;
		        }
			}
		}catch (SQLException ex) {	//Handle errors for JDBC
			ex.printStackTrace();
		} catch (Exception e){		//Handle errors for Class.forName
			e.printStackTrace();
		}
	}
}