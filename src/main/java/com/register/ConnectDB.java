package com.register;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectDB<Baby> {

	private static final int UsersID = 0;
	String dburl="jdbc:mysql://localhost:3306/registration";
	String dbuser="root";
	String dbpwd="";
	String dbDriver="com.mysql.cj.jdbc.Driver";
	Connection con=null;
	/*
	 * private User adminDahboard; private Component adminDashboarduser;
	 */
	
	public void loadDriver() {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
			System.out.println("No driver Found "+e.getMessage());
		}
	}
	
	
	public Connection DBconnection() {
		try {
			con=DriverManager.getConnection(dburl,dbuser,dbpwd);
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("Not connected !!"+e.getMessage());
			
		}
		
		return con;
	}
	
	public String addUser(User user1) {
	    loadDriver();
	    Connection cnx = DBconnection();
	    String message = "Inserted";

	    String checkSql = "SELECT COUNT(*) FROM users WHERE email=?";
	    try {
	        PreparedStatement checkSt = cnx.prepareStatement(checkSql);
	        checkSt.setString(1, user1.getEmail());
	        ResultSet resultSet = checkSt.executeQuery();
	        resultSet.next();
	        int count = resultSet.getInt(1);
	        if (count > 0) {
	   
	            JOptionPane.showMessageDialog(null, "Email already exists");
	            return "Not Inserted";
	        }
	    } catch (SQLException e) {
	        System.out.println("Error while checking email existence: " + e.getMessage());
	        e.printStackTrace();
	        return "Not Inserted";
	    }


	    String sql = "INSERT INTO users(Fullname, email, password) VALUES(?, ?, ?)";

	    try {
	        PreparedStatement st = cnx.prepareStatement(sql);
	        st.setString(1, user1.getFullname());
	        st.setString(2, user1.getEmail());
	        st.setString(3, user1.getPassword());
	        int row = st.executeUpdate();
	        if (row > 0) {
	            JOptionPane.showMessageDialog(null, "User Created");
	        }
	    } catch (SQLException e) {
	        System.out.println("Not inserted: " + e.getMessage());
	        e.printStackTrace();
	        return "Not Inserted";
	    }

	    return message;
	}

	public ResultSet loginUser(LoginSetter loginuser) {
		ResultSet row=null;
		 loadDriver();
		 Connection cnx = DBconnection();
		 String sql="SELECT * FROM users WHERE email=? AND password=?";
		    try {
				PreparedStatement st = cnx.prepareStatement(sql);
 
				st.setString(1, loginuser.getEmail());
				st.setString(2, loginuser.getPassword());
				row=st.executeQuery();
			} catch (SQLException e) {
		
				e.printStackTrace();
			}
		
		return row;
		
	}


	public  void addBabby(Babby user2) {
		String message="added";
		loadDriver();
		Connection cnx =DBconnection();
		
		String sql ="INSERT INTO registered (Baby_Name,Gender,Date_of_Birth,Parent_Name,Contact_Number,Address) VALUES(?,?,?,?,?,?)";
				
		try {
			PreparedStatement rs =cnx.prepareStatement(sql);
			rs.setString(1,user2.getBaby_Name());
			rs.setString(2,user2.getGender());
			rs.setString(3,user2.getDate_of_Birth());
			rs.setString(4,user2.getParent_Name());
			rs.setString(5,user2.getContact_Number());
			rs.setString(6,user2.getAdddress());
			rs.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();

		}

	

	}
	public ResultSet getAllbabyList() {
	    ResultSet rows = null;
	    loadDriver();
	    Connection cnx = DBconnection();
	    String sql = "SELECT * FROM registered"; // Modify the SQL query as needed
	    try {
	        PreparedStatement stm = cnx.prepareStatement(sql);
	        rows = stm.executeQuery();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return rows;
	}

	public ResultSet getAllUserList() {
	    ResultSet rows = null;
	    loadDriver();
	    Connection cnx = DBconnection();
	    String sql = "SELECT * FROM users"; // Modify the SQL query as needed
	    try {
	        PreparedStatement stm = cnx.prepareStatement(sql);
	        rows = stm.executeQuery();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return rows;
	}


	public void deleteregistered(int babyID) {
		// TODO Auto-generated method stub
		
	}
	
	public String updateUser(String fullname,String email,String role,int id) {
		String message="Success to update";
		loadDriver();
		Connection cnx=DBconnection();
		String sql="UPDATE users SET Fullname=?,email=?,role=? WHERE ID=? ";
        try {
			PreparedStatement st = cnx.prepareStatement(sql);
			  st.setString(1, fullname);
		        st.setString(2, email);
		        st.setString(3, role);
		        int row = st.executeUpdate();
		        if (row > 0) {
		            JOptionPane.showMessageDialog(null, "User update");
		        }
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return message;
		
	}
	public boolean deleteuser(int userID)throws SQLException{
		loadDriver();
		Connection cnx=DBconnection();
		String sql ="DELETE FROM users WHERE ID=?";
		try
		(PreparedStatement st=cnx.prepareStatement(sql)){
			st.setInt(1, userID);
			st.executeUpdate();
		}
		return true;
	}
	
}