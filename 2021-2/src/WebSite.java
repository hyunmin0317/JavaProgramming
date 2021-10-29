public class WebSite {

	public static void main(String[] args) {
		PasswordInfo p;
		PasswordDAO passwordDao = new PasswordDAOImpl();
		System.out.println("--- inserting...");

		p = new PasswordInfo("https://www.smu.ac.kr", "smu", "abcde");
		passwordDao.insert(p);
		p = new PasswordInfo("https://www.smu2.ac.kr", "smu2", "abcde");
		passwordDao.insert(p);
		System.out.println("--- finding all...");
		
		for (PasswordInfo pi : passwordDao.findAll()) {
			System.out.println("reading... " + pi);
		}

		System.out.println("--- updating...");
		p = passwordDao.findAll().get(1);
		System.out.println(p.getUrl());
		p.setId("smu");
		passwordDao.update(p);
		System.out.println("--- see if updated...");
		p = passwordDao.findByKey("https://www.smu2.ac.kr");

		if (p != null) {
			System.out.println(p);
		}

		System.out.println("--- deleting...");
		passwordDao.delete("https://www.smu2.ac.kr"); // or passwordDao.delete(p);
		System.out.println("--- finding all after deleting...");
		for (PasswordInfo pi : passwordDao.findAll()) {
			System.out.println("reading... " + pi);
		}		
	}
}
