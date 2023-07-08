package dao; 
import java.sql.*;
import model.Login;
import ConnectionManager.ConnectionManager;

public class LoginDAO {
	public boolean validate(Login login)throws ClassNotFoundException,SQLException
	{
		String username =login.getUsername();
		String password =login.getPassword();
		
		ConnectionManager conn=new ConnectionManager();
		Connection con= conn.establishConnection();
		
		Statement st=con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from login");
		
		while(rs.next())
		{
			if (username.equals(rs.getString("user_name"))&& password.equals(rs.getString("password")))
			{
				//close the connection
				conn.closeConnection();
				return true;
			}
		}
		conn.closeConnection();
		return false;
		
	}
}





