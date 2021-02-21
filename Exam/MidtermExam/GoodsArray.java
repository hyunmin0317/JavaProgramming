package Exam.MidtermExam;
import java.util.Scanner;
// �߰����� 3�� ����
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
		System.out.println("��ǰ ������ ���ʷ� �Է��϶�.");
		for(i=0; i<G.length; i++)
			G[i] = new Goods(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.println("�Էµ� ��ǰ ������ ������ �����ϴ�.");
		for(i=0; i<G.length; i++)
			System.out.println(G[i].getName()+" "+G[i].getPrice()+" "+G[i].getNumberOfStock()+" "+G[i].getSold());		
		sc.close();
	}
}