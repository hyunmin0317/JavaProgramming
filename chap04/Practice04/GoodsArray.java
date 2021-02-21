package chap04.Practice04;
import java.util.Scanner;
// ���� 4-3 : ��ü �迭 ����
class Good {
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
	Good(String n, int p, int nStock, int s) {
		name = n;
		price = p;
		numberOfStock = nStock;
		sold = s;
	}

	String getName() {return name;} 
	int getPrice() {return price;}
	int getNumberOfStock() {return numberOfStock;}
	int getSold() {return sold;}
}

public class GoodsArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Good g[] = new Good[3];
		for(int i=0; i<g.length; i++)
			g[i] = new Good(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		for(int i=0; i<g.length; i++)
			System.out.println(g[i].getName()+" "+g[i].getPrice()+" "+g[i].getNumberOfStock()+" "+g[i].getSold());
		sc.close();
	}
}