package assignments.assignment06;

import java.util.ArrayList;
import java.util.List;

public class PasswordDAOList implements PasswordDAO {
	ArrayList<PasswordInfo> array;
	
	public PasswordDAOList() {
		array = new ArrayList<PasswordInfo>();
	}
	
	
	@Override
	public void insert(PasswordInfo p) {
		array.add(p);
	}

	@Override
	public List<PasswordInfo> findAll() {
		return array;
	}

	@Override
	public PasswordInfo findByKey(String url) {
		for(PasswordInfo p : array) {
			if (p.getUrl() == url)
				return p;
		}
		return null;
	}

	@Override
	public void update(PasswordInfo p) {
		PasswordInfo password = findByKey(p.getUrl());
		if (password != null) {
			password.setId(p.getId());
			password.setPassword(p.getPassword());
		}
	}

	@Override
	public void delete(String url) {
		PasswordInfo p = findByKey(url);
		if (p != null)
			array.remove(p);
	}

	@Override
	public void delete(PasswordInfo p) {
		array.remove(p);
	}

}
