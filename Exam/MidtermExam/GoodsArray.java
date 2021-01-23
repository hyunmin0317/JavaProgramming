package MidtermExam;
import java.util.Scanner;
// 중간고사 3번 문제
class Goods {
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	Goods(String name, int price, int numberOfStock, int sold) {
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}
	String getName() {return name;}
	int getPrice() {return price;}
	int getNumberOfStock() {return numberOfStock;}
	int getSold() {return sold;}
}

public class GoodsArray {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		Goods[] G = new Goods[3];
		System.out.println("상품 세개를 차례로 입력하라.");
		for(i=0; i<G.length; i++)
			G[i] = new Goods(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.println("입력된 상품 정보는 다음과 같습니다.");
		for(i=0; i<G.length; i++)
			System.out.println(G[i].getName()+" "+G[i].getPrice()+" "+G[i].getNumberOfStock()+" "+G[i].getSold());		
		sc.close();
	}
}