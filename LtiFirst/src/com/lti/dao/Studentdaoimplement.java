package com.lti.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.lti.pojo.Student;

public class Studentdaoimplement implements StudentDao {
		Connection conn=null;
		PreparedStatement ps=null;
		public Studentdaoimplement() {
			try {
				Driver driver =new oracle.jdbc.driver.OracleDriver();
				DriverManager.registerDriver(driver);
				conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
				
			}
			catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}
				
	@Override
	public boolean addStudent(Student st) {
		//add a student to database
		boolean inserted=false;
		
		try {
			ps=conn.prepareStatement("insert into Studentinfo values(?,?,?)");
			ps.setInt(1,st.getSid());
			ps.setString( 2,st.getName());
			ps.setString( 3,st.getCity());
			int changed=ps.executeUpdate();
			//return the number of rows changed
			if(changed>0) {
				System.out.println("Student is inserted in the db");
				inserted=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return inserted;
		
	}
	@Override
	public List<Student> getStudent() {
		List<Student>sts=new ArrayList<Student>();
		try {
			ps=conn.prepareStatement("select * from Studentinfo");
			ResultSet rs=ps.executeQuery();	
			while(rs.next()) {
				Student st=new Student(rs.getInt(1),rs.getString(2),rs.getString(3));
				sts.add(st);
			}
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return sts;
	}

	@Override
	public boolean updateStudent(Student st) {
		// TODO Auto-generated method stub
		boolean updated=false;
		
		try {
			ps=conn.prepareStatement("update Studentinfo set sname=?,city=? where sid=?");
			ps.setString(1, st.getName());
			ps.setString(2, st.getName());
			ps.setInt(3, st.getSid());
			int c=ps.executeUpdate();
			if(c>0) {
				System.out.println("updated");
				updated=true;
			}
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return updated;
		
	}

	@Override
	public boolean deleteStudent(int sid) {
		boolean deleted=false;
		try {
			ps=conn.prepareStatement("delete from Studentinfo where sid=?");
			ps.setInt(1, sid);
			int c=ps.executeUpdate();
			if(c>0) {
				System.out.println("deleted");
				deleted=true;
			}
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return deleted;
	}

	@Override
	public Student searchStudent(int sid) {
		try {
			ps=conn.prepareStatement("select * from Studentinfo where sid=?");
			ps.setInt(1, sid);
			ResultSet rset=ps.executeQuery();
			if(rset.next()) {
				return new Student(rset.getInt(1),rset.getString(2),rset.getString(3));
			}
			else {
				System.out.println("student not found");
				return null;
			}
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;

	}
}
