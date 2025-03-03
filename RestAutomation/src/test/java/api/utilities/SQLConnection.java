package api.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class SQLConnection {

	@Test
	public void ConnectSQL() throws SQLException
	{
		Connection connection= DriverManager.getConnection("");
		Statement statement=connection.createStatement();
		ResultSet resultset=statement.executeQuery("Select * from Employees");
		while (resultset.next())
		{
			System.out.println(resultset.getString(0));
		}
	}
}
