package QSN2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class JDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url ="jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String username="System";
		String password="1234";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection Created");
		Statement stmt=con.createStatement();
		
		/*String CreateQuery="CREATE TABLE QSN2(ID NUMBER(10), NAME VARCHAR(50), SUBJECT VARCHAR(50), MARKS NUMBER(10)) ";
		stmt.executeUpdate(CreateQuery);
		
		String insertRecord1="INSERT INTO QSN2 VALUES(1,'AKSHAY','SCIENCE',100)";
		stmt.executeUpdate(insertRecord1);
		String insertRecord2="INSERT INTO QSN2 VALUES(2,'AKASH','SOCIAL',70)";
		stmt.executeUpdate(insertRecord2);
		String insertRecord3="INSERT INTO QSN2 VALUES(3,'PRAMOD','MATHS',80)";
		stmt.executeUpdate(insertRecord3);
		String insertRecord4="INSERT INTO QSN2 VALUES(4,'SAGAR','ENGLISH',90)";
		stmt.executeUpdate(insertRecord4);*/
		
		String updateQuery="UPDATE QSN2 SET ID=9,NAME='TARUN',SUBJECT='HISTORY',MARKS=70 WHERE ID=3 ";
		stmt.executeUpdate(updateQuery);
		
		ResultSet rs=stmt.executeQuery("SELECT * FROM QSN2");
		System.out.println("TABLE CREATED");
		while(rs.next()) {
			System.out.println(rs.getString("ID") + " : " +  rs.getString("NAME") + " : " + rs.getString("SUBJECT")+" : " + rs.getString("MARKS") );
		}
		con.close();
		}

	}

