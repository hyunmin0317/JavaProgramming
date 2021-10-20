package midterm2019;

public class linearSearch implements Search{

	@Override
	public boolean search(int num, int[] list) {
		for (int i=0; i<list.length; i++) {
			if (list[i] == num)
				return true;
		}
		return false;
	}
}
