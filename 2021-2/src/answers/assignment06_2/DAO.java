package answers.assignment06_2;

import java.util.List;

public interface DAO<D, K> {
	public void insert(D data);
	public List<D> findAll();
	public D findByKey(K key);
	public void update(D data);
	public void deleteByKey(K key);
	public void delete(D data);
}