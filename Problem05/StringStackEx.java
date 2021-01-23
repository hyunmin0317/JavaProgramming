package Problem05;
import java.util.Scanner;
// 실습 05-03
interface Stack{	// interface Stack 선언
    int length();
    Object pop();
    boolean push(Object ob);
}
 
class StringStack implements Stack{	// interface StringStack구현
    private String stack[];
    private int top;
    StringStack(int length){	// 생성자 선언
        stack = new String[length];
        top = -1;
    }
    public int length(){	// 스택의 길이 반환
        return stack.length;
    }
    public Object pop(){	// 스택의 pop 연산
        if(top == -1) return "비어있는 스택";
        return stack[top--];
    }
    public boolean push(Object ob){	// 스택의 push 연산
        if(top == stack.length) 
        	return false;
        stack[++top] = (String)ob;
        return true;
    }
    public void printStack(){	// 스택의 모든 값을 출력
        System.out.print("스택 [");
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
        System.out.print("스택의 길이: ");
        n = sc.nextInt();
    	StringStack stack1 = new StringStack(n);   	
    	for(int i = 0; i < n; i++) {
    		System.out.print("문자열"+(i+1)+" 입력: ");
    		stack1.push(sc.next());
    	}
        stack1.printStack();
        for(int i = 0; i < n; i++)
        	System.out.println(stack1.pop());
        sc.close();
    }
}