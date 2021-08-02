import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Driver Loading
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2. Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/scott?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8","ssafy","ssafy");
		// 3. Statement Create
		Statement st = con.createStatement();
		// 4. SQL Excute
		String sql ="Insert into emp(empno, ename, sal) values(9999, '또치',  1000)";
		st.execute(sql);
		
		// 5. close  
		con.close();
		st.close();
		System.out.println("SQL 실행완료!");
	}

}