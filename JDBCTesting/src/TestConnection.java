import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;



public class TestConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String host="localhost";
		String port="3306";
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://"+ host +":" + port +"/job", "root", "admin");
		
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("Select * from Job where job_ID='670'");
		rs.next();
		System.out.println(rs.getString("Functions"));
		
		driver.get(URL);
		driver.findElement(By.xpath(port)).rs.getString("Functions"));
		
		
	}

}
