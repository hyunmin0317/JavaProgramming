package Problem03;

public class ThreeSixNine {
	public static void main(String[] args) {
		for (int i = 0; i<100; i++) {
			int count = 0;
			if (i%10==3 || i%10==6 || i%10==9)
				count++;
			if (i/10==3 || i/10==6 || i/10==9)
				count++;
			if (count == 1)
				System.out.println(i+" 박수 한번");
			if (count == 2)
				System.out.println(i+" 박수 두번");
		}
	}
}