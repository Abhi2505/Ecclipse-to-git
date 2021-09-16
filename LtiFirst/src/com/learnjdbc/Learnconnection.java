package com.learnjdbc;
import java.sql.*;
public class Learnconnection {
public static void main(String[] args)  {
	//class not found is a checked exception
	Connection con = null;
	try {
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//above and below are two ways in which u can register the driver
		Driver driver=new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(driver);
		//above we have shown two ways to register driver the first can lead to class not found checked exception
		//driver is like translator to connect with db so that to convert the java call to db specific calls
		//register driver
		//lets connect is like make a road to database
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			Statement stmt=con.createStatement();
			//create statment is like creating vehicle to take our query to db
			ResultSet rs=stmt.executeQuery("select * from Employees");
			//exceute query is like take query in vehicel and return result set 
			int i=0;
			//to axis result set rs.next
			while(rs.next()&&i<12) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
				i++;
			}
	}	
//	 catch (ClassNotFoundException e) {
//		e.printStackTrace();
//}
	 catch (SQLException e) {
			e.printStackTrace();
		}
	finally {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
}