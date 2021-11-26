package answers.assignment06_2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public abstract class DAOImpl<D extends DBData<K>, K> implements DAO<D, K> {
	String dbtableName;
	public abstract Statement getStatement();
	public abstract String getInsertValueStr(D data);
	public abstract D getNewData(ResultSet rs);
	public abstract String getKeyColumnName();
	public abstract String getUpdateValueStr(D data);

	public DAOImpl(String dbtableName) {
		this.dbtableName = dbtableName;
	}

	@Override
	public void insert(D data) {
		try {
			String fmt = "INSERT INTO %s VALUES(%s)";
			String q = String.format(fmt, dbtableName, getInsertValueStr(data));
			
			getStatement().execute(q);
		}
		catch (SQLException e) { e.printStackTrace(); }
	}

	@Override
	public List<D> findAll() {
		ArrayList<D> dataList = new ArrayList<D>();
		ResultSet rs;
		
		try {
			rs = getStatement().executeQuery("SELECT * FROM " + dbtableName);
			while (rs.next()) {
				dataList.add(getNewData(rs));
			}
		} catch (SQLException e) { e.printStackTrace(); }
		return dataList;
	}

	@Override
	public D findByKey(K key) {
		D data = null;
		ResultSet rs;
		
		try {
			String fmt = "SELECT * FROM %s WHERE %s = '%s'";
			String q = String.format(fmt, dbtableName, getKeyColumnName(), key.toString());
			rs = getStatement().executeQuery(q);
			if (rs.next()) {
				data = getNewData(rs);
			}
		} catch (SQLException e) { e.printStackTrace(); }
		return data;
	}

	@Override
	public void update(D data) {
		D data2 = findByKey(data.getKey());
		if (data2 != null) {
			try {
				String fmt = "UPDATE %s SET %s WHERE %s = '%s'";
				String q = String.format(fmt, dbtableName, 
						getUpdateValueStr(data), getKeyColumnName(), data.getKey().toString());
				getStatement().execute(q);
			} catch (SQLException e) { e.printStackTrace(); }
		}
		
	}

	@Override
	public void deleteByKey(K key) {
		try {
			String fmt = "DELETE FROM %s WHERE %s = '%s'";
			String q = String.format(fmt, dbtableName, getKeyColumnName(), key.toString());
			getStatement().execute(q);
		} catch (SQLException e) { e.printStackTrace(); }
	}

	@Override
	public void delete(D data) { 
		deleteByKey(data.getKey()); 
	}
}
