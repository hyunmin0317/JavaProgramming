package Problem04;
//실습04-06
public class Sub {
	int a,b;
	void setValue(int a, int b) {	//값을 저장
		this.a = a;
		this.b= b;
	}
	int calculate() {	//값을 계산하여 반환
		return a-b;
	}
}