package ConnectionManager;

import  java.sql.*;

public class ConnectionManager
{
	Connection con=null;
	public Connection establishConnection()throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Naveenkumar","root","root");
		return con;
		
	}
	public void closeConnection()throws SQLException
	{
		con.getClass();
	}
	
}

