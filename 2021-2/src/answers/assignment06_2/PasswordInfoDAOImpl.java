package answers.assignment06_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PasswordInfoDAOImpl implements PasswordInfoDAO {
	final static String DB_FILE_NAME = "passwords.db";
	final static String DB_TABLE_NAME = "passwords";

	Connection connection = null;
	ResultSet rs = null;
	Statement statement = null;

	public PasswordInfoDAOImpl() {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:" + DB_FILE_NAME);
			statement = connection.createStatement();	// set timeout to 30 sec.
			statement.setQueryTimeout(30); 
			final String table = " (URL text PRIMARY KEY, id text, password text)";
			
			// create table
			statement.executeUpdate("DROP TABLE IF EXISTS " + DB_TABLE_NAME);
			statement.executeUpdate("CREATE TABLE " + DB_TABLE_NAME + table);
		} catch (SQLException e) { e.printStackTrace(); }
	}

	@Override
	public void insert(PasswordInfo p) {
		try {
			String fmt = "INSERT INTO %s VALUES('%s', '%s', '%s')";
			String q = String.format(fmt, DB_TABLE_NAME, 
			p.getUrl(), p.getId(), p.getPassword());
			statement.execute(q);
		}
		catch (SQLException e) { e.printStackTrace(); }
	}

	@Override
	public List<PasswordInfo> findAll() {
		ArrayList<PasswordInfo> passwordInfos = new ArrayList<PasswordInfo>();
		try {
			rs = statement.executeQuery("SELECT * FROM " + 
			DB_TABLE_NAME);
			while (rs.next()) {
				passwordInfos.add(new PasswordInfo(rs.getString("URL"), 
				rs.getString("id"), rs.getString("password")));
			}
		} catch (SQLException e) { e.printStackTrace(); }
		return passwordInfos;
	}

	@Override
	public PasswordInfo findByUrl(String url) {
		PasswordInfo passwordInfo = null;
		try {
			String fmt = "SELECT * FROM %s WHERE URL = '%s'";
			String q = String.format(fmt, DB_TABLE_NAME, url);
			rs = statement.executeQuery(q);
			if (rs.next()) {
				passwordInfo = new PasswordInfo(rs.getString("URL"), 
				rs.getString("id"), rs.getString("password"));
			}
		} catch (SQLException e) { e.printStackTrace(); }
		
		return passwordInfo;
	}

	@Override
	public void update(String url, PasswordInfo p) {
		PasswordInfo passwordInfo = findByUrl(url);
		if (passwordInfo != null) {
			try {
				String fmt = "UPDATE %s SET id = '%s', password = '%s' WHERE URL = '%s'";
				String q = String.format(fmt, DB_TABLE_NAME, 
				p.getId(), p.getPassword(), p.getUrl());
				statement.execute(q);
			} catch (SQLException e) { e.printStackTrace(); }
		}
		
	}

	@Override
	public void delete(String url) {
		try {
			String fmt = "DELETE FROM %s WHERE URL = '%s'";
			String q = String.format(fmt, DB_TABLE_NAME, url);
			statement.execute(q);
		} catch (SQLException e) { e.printStackTrace(); }
	}

	@Override
	public void delete(PasswordInfo p) { delete(p.getUrl()); }
}
