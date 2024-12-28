package jdbcpack;

import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;

public class Jdbcdemo {

	public static void main(String[] args) throws Exception {
	
		String url = "jdbc:mysql://localhost:3306/Jdbcdemosql";
	    String userName = "root";
	    String passWord = "Kamatchi@sindhu";
	    String query = "select * from Employee";

	     Connection con = DriverManager.getConnection(url,userName,passWord);   
	       Statement st = con.createStatement();
	         ResultSet rs = st.executeQuery(query);
	         con.close();

	}

}
