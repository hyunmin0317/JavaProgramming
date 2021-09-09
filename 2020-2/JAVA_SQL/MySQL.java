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
			// db이름: mydb, db비밀번호: 0317
			conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "0317");	
			stmt = conn.createStatement();
			while (true) {
				System.out.println("========================================");
				System.out.println("(0) 종료\n(1) 릴레이션 생성 및 데이터 추가\n(2) 제목을 이용한 검색");
				System.out.println("(3) 관객수를 이용한 검색\n(4) 개봉일을 이용한 검색");
				System.out.println("========================================");
				System.out.print("원하는 번호 입력: ");
				select = sc.nextInt();							// 옵션 선택
		        switch (select) 
		        {
		        case 0: // 종료
		        	System.out.println("프로그램을 종료합니다.");		// 프로그램 종료
		            sc.close();
		            stmt.close();
		            conn.close();
		            return;
		        case 1:	// 릴레이션 생성 및 데이터 추가
		        	File file = new File("C:\\movie_data.txt");								// C드라이브에 있는 movie_data.txt 파일을 연결
		            try (BufferedReader br = new BufferedReader(new FileReader(file))) {	// BufferedReader를 통해 파일의 데이터를 읽음
		            	String line;
		            	StringTokenizer st;
		            	while ((line = br.readLine()) != null) {							// 데이터를 한줄 단위의 문자열로 읽음
		            		st = new StringTokenizer(line, "|");							// 주어진 문자열을 토큰인 '|'을 기준으로 나누어 읽음
		            	    while(st.hasMoreTokens()) {
		            	    	try {														// 주어진 데이터를 query문을 통해 db에 저장
			            	    	stmt.executeUpdate("insert into movie values("+st.nextToken()+",'"+st.nextToken()+"','"+st.nextToken()+"','"+st.nextToken()+"','"+st.nextToken()+"',"+st.nextToken()+","+st.nextToken()+","+st.nextToken()+",'"+st.nextToken()+"')");
			            	    	} catch (SQLException sqle) {    						// 주어진 데이터 입력 오류시
			            	    		System.out.println("Could not insert tuple. " + sqle);
			            	    		}
		            	    }
		            	}
		            } catch (IOException e) {												// 입출력 오류 시
		            	System.out.println("입출력 오류");
		            }
		            rs = stmt.executeQuery("SELECT * FROM movie");	// Execute a query
		            while(rs.next())	// Print results
                    	System.out.println("|"+rs.getString(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getDate(4)+"|"+rs.getString(5)+"|"+rs.getInt(6)+"|"+rs.getLong(7)+"|"+rs.getInt(8)+"|"+rs.getString(9));
                    System.out.println("입력을 완료했습니다.");
		            break;
		        case 2:	// 제목을 이용한 검색
		        	System.out.print("사용자 입력: ");
					rs = stmt.executeQuery("SELECT * FROM movie WHERE title like '%"+sc.next()+"%'");	// Execute a query
					while(rs.next())	// Print results
                    	System.out.println("|"+rs.getString(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getDate(4)+"|"+rs.getString(5)+"|"+rs.getInt(6)+"|"+rs.getLong(7)+"|"+rs.getInt(8)+"|"+rs.getString(9));
                    System.out.println("검색을 완료했습니다.");
		            break;
		        case 3:	// 관객수를 이용한 검색
		        	System.out.print("사용자 입력: ");
					rs = stmt.executeQuery("SELECT * FROM movie WHERE totalnum > "+sc.next());	// Execute a query
					while(rs.next())	// Print results
                    	System.out.println("|"+rs.getString(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getDate(4)+"|"+rs.getString(5)+"|"+rs.getInt(6)+"|"+rs.getLong(7)+"|"+rs.getInt(8)+"|"+rs.getString(9));
                    System.out.println("검색을 완료했습니다.");
		            break;
		        case 4:	// 개봉일을 이용한 검색
		        	System.out.print("사용자 입력: ");
					rs = stmt.executeQuery("SELECT * FROM movie WHERE releasedate >= '"+sc.next()+"' AND releasedate <= '"+sc.next()+"'");	// Execute a query
					while(rs.next())	// Print results
                    	System.out.println("|"+rs.getString(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getDate(4)+"|"+rs.getString(5)+"|"+rs.getInt(6)+"|"+rs.getLong(7)+"|"+rs.getInt(8)+"|"+rs.getString(9));
                    System.out.println("검색을 완료했습니다.");
		            break;
		        default:	// 범위 밖 숫자를 입력했을때
		            System.out.println("잘못 입력하셨습니다. (0 ~ 4)");
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