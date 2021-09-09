package Exam.MidtermExam;
// �߰����� 4�� ����
class CurrencyConverter {
	private static double rate;
	static void setRate(double r) {
		rate = r;
	}
	static double toDollar(double won) {
		return won/rate;
	}
	static double toKWR (double dollar) {
		return dollar*rate;
	}
}

public class StaticMember {
	public static void main(String[] args) {
		CurrencyConverter.setRate(1121);
		System.out.println("�鸸���� "+CurrencyConverter.toDollar(1000000)+"�޷��Դϴ�.");
		System.out.println("��޷��� "+CurrencyConverter.toKWR(100)+"���Դϴ�.");
	}
}