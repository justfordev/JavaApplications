package cn.java.base.ch13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("The driver of [ " + driver + "] does not exsist...");
			e.printStackTrace();
		}
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.1.53:3306/justfordev", "justfordev", "new12315");
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery("select * from teacher");
			while(rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
