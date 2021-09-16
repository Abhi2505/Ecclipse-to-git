package com.learnjdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Saverecords {
public static void main(String[] args) {
	Connection conn=null;
	try {
		Driver driver =new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(driver);
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		//Statement st=conn.createStatement();
		//for dml statement we have to do execute update for executing queryy
		Scanner o=new Scanner(System.in);
		System.out.println("enter sid ,name,city of student");
		int sid=o.nextInt();
		//execute query used for select st
		String name=o.next();
		String city=o.next();
		//insert into Studentinfo values(100,'abhi','bhopal'); esi query ko likhne me ye dhyn rkhna pdta ki string h toh ''singlle quotes m aygi in normal statement execution
		//typing query in above format in java is tough so better is use prepared statement	
		
		PreparedStatement ps=conn.prepareStatement("insert into Studentinfo values(?,?,?)");
		ps.setInt(1, sid);
		ps.setString(2,name);
		ps.setString(3, city);
		ps.executeUpdate();
		System.out.println("detail saved");
	}
	catch(SQLException e) {
		System.out.println(e.getMessage());
	}
}
}
