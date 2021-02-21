package chap05.Problem05;
import java.util.Scanner;
// �ǽ� 05-03
interface Stack{	// interface Stack ����
    int length();
    Object pop();
    boolean push(Object ob);
}
 
class StringStack implements Stack{	// interface StringStack����
    private String stack[];
    private int top;
    StringStack(int length){	// ������ ����
        stack = new String[length];
        top = -1;
    }
    public int length(){	// ������ ���� ��ȯ
        return stack.length;
    }
    public Object pop(){	// ������ pop ����
        if(top == -1) return "����ִ� ����";
        return stack[top--];
    }
    public boolean push(Object ob){	// ������ push ����
        if(top == stack.length) 
        	return false;
        stack[++top] = (String)ob;
        return true;
    }
    public void printStack(){	// ������ ��� ���� ���
        System.out.print("���� [");
        for(int i=0; i<stack.length; i++){
            System.out.print(stack[i]);
        }
        System.out.println("]");
    }
}
 
public class StringStackEx {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("������ ����: ");
        n = sc.nextInt();
    	StringStack stack1 = new StringStack(n);   	
    	for(int i = 0; i < n; i++) {
    		System.out.print("���ڿ�"+(i+1)+" �Է�: ");
    		stack1.push(sc.next());
    	}
        stack1.printStack();
        for(int i = 0; i < n; i++)
        	System.out.println(stack1.pop());
        sc.close();
    }
}