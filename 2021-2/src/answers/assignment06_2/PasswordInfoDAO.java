package answers.assignment06_2;

import java.util.List;

public interface PasswordInfoDAO {
	public void insert(PasswordInfo p);
	public List<PasswordInfo> findAll();
	public PasswordInfo findByUrl(String url);
	public void update(String url, PasswordInfo p);
	public void delete(String url);
	public void delete(PasswordInfo p);
}