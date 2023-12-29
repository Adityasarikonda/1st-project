package Sample;

public class Pen {
    String name;
    String colour;
    int id;
    void display(){
        System.out.println(name);
        System.out.println(colour);
        System.out.println(id);
    }
    void insert(String n, String a, int i) {
        name = n;
        colour = a;
        id = i;
    }
    public static void main(String args[]){
        Pen p1 = new Pen();
        Pen p2 = new Pen();
        p1.insert( "Ball pen",  "Red",  20);
        p1.display();
        p2.insert("gel pen","blue",30);
        p2.display();
    }
}
