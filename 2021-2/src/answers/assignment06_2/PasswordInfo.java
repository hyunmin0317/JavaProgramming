package answers.assignment06_2;

public class PasswordInfo implements DBData<String> {
	private String key;
	private String id;
	private String password;
	
	PasswordInfo(String key, String id, String pw){
		this.key = key;
		this.id = id;
		this.password = pw;
	} 
	
	public String toString() {
		return "" + key + ", " + id + ", " + password;
	} 
	
	public String getKey() { return key; } 
	public String getId() { return id; }
	public void setId(String id) { this.id = id; }
	public String getPassword() { return password; }
	public void setPassword(String pw) { this.password = pw; }
}