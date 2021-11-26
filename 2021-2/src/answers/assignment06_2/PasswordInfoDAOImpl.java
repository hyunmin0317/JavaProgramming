package answers.assignment06_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PasswordInfoDAOImpl extends DAOImpl<PasswordInfo, String> {
	final static String DB_FILE_NAME = "passwords.db";

	Connection connection = null;
	ResultSet rs = null;
	Statement statement = null;

	public PasswordInfoDAOImpl(String dbTableName) {
		super(dbTableName);
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:" + DB_FILE_NAME);
			statement = connection.createStatement();	// set timeout to 30 sec.
			statement.setQueryTimeout(30); 
			final String table = " (URL text PRIMARY KEY, id text, password text)";
			
			// create table
			statement.executeUpdate("DROP TABLE IF EXISTS " + dbTableName);
			statement.executeUpdate("CREATE TABLE " + dbTableName + table);
		} catch (SQLException e) { e.printStackTrace(); }
	}

	@Override
	public Statement getStatement() { return statement; }

	@Override
	public String getInsertValueStr(PasswordInfo data) {
		String fmt = "'%s', '%s', '%s'";
		String q = String.format(fmt, data.getKey(), data.getId(), data.getPassword());
		return q;
	}

	@Override
	public PasswordInfo getNewData(ResultSet rs) {
		PasswordInfo p = null;
		if (rs != null) {
			try {
				p = new PasswordInfo(rs.getString("URL"), rs.getString("id"), rs.getString("password"));
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
		return p;
	}

	@Override
	public String getKeyColumnName() {
		return "URL";
	}

	@Override
	public String getUpdateValueStr(PasswordInfo data) {
		String fmt = "id = '%s', password = '%s'";
		String q = String.format(fmt, data.getId(), data.getPassword());
		return q;
	}
	
	
}
