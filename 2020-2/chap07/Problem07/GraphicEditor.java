package chap07.Problem07;
import java.util.*;
// �ǽ� 07-01
abstract class GraphicObject{
    int x,y,w,h;
    public GraphicObject(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    public abstract void view();
}
class Rect extends GraphicObject{
    public Rect(int x, int y, int w, int h) {
        super(x, y, w, h);
    }
    public void view() {
        System.out.println(x+","+y+" -> "+w+","+h+"�� �簢��");
    }
}
class Line extends GraphicObject{
    public Line(int x, int y, int w, int h) {
        super(x, y, w, h);
    }
    public void view() {
        System.out.println(x+","+y+" -> "+w+","+h+"�� ��");
    }   
}

public class GraphicEditor {
    Vector<GraphicObject> v = new Vector<GraphicObject>();
    void add(GraphicObject ob){
        v.add(ob);
    }
    void draw(){
        for(int i=0;i<v.size();i++){
            v.get(i).view();
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	GraphicEditor c = new GraphicEditor();
        c.add(new Rect(2,2,3,4));
        c.add(new Line(3,3,8,8));
        c.add(new Line(2,5,6,6));
        c.draw();
    }
}