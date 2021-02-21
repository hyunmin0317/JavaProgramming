package chap07.Problem07;
// �ǽ� 07-02
public class MyClass<E> {
    private E e;
    public MyClass(E e){
        this.e = e;
    }
    void setS(E e){
        this.e = e;
    }
    E getS(){
        return e;
    }
    public static void main(String[] args) {
    	MyClass<String> s = new MyClass<String>("������");
    	MyClass<Integer> i = new MyClass<Integer>(19990317);
        System.out.println(s.getS());
        System.out.println(i.getS());
        i.setS(20190517);
        System.out.println(i.getS());
    }
}