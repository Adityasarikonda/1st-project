package Sample;

public class Student {
    String name; // Data Member
    int age;
    int id;

    int length;

    int breadth;
    void insert(String n, int a, int i){
        name = n;
        age =a;
        id = i;
    }

    void insert(String n, int a){
        name = n;
        age = a;
    }
    void display() {

        System.out.println(name);
        System.out.println(age);
        System.out.println(id);
    }

    int agevalue(){

        return 26;
    }

void area(int l, int b){
        length = l;
        breadth = b;
        System.out.println("Area of rectangle is"+(length*breadth));

}


    public static void main(String args[]){

        Student s1 = new Student();
        Student s2 = new Student();


 //      s1.name = "Babbu";
  //     s1.age = 24;
   //    s1.id = 101;
   //     System.out.println(s1.name);
//        System.out.println(s1.age);
 //       System.out.println(s1.id);
  //       s1.insert("Babbu",24,104);
        s1.insert("Babbu",27);
        s1.display();


  //      s2.name = "Aditya";
  //      s2.age = 27;
  //      s2.id = 102;
 //        System.out.println(s2.name);
  //       System.out.println(s2.age);
  //      System.out.println(s2.id);
        s2.insert("aditya",24,103);

        s2.display();
        System.out.println(s2.agevalue());
        s2.area(30,20);
    }
}
