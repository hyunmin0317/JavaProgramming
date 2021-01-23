package MidtermExam;
// 중간고사 4번 문제
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
		System.out.println("백만원은 "+CurrencyConverter.toDollar(1000000)+"달러입니다.");
		System.out.println("백달러는 "+CurrencyConverter.toKWR(100)+"원입니다.");
	}
}