package ControlStatements;

public class vowel {
    public static void main(String[] args) {
        char ch='e';
        switch (ch){
            case 'a':
                System.out.println("a is vowel");
                break;
            case 'e':
                System.out.println("e is vowel");
                break;
            case 'i':
                System.out.println("i is vowel");
                break;
            case 'o':
                System.out.println("o is vowel");
                break;
            case 'u':
                System.out.println("u is vowel");
                break;
            default:
                System.out.println(ch+  " is consonant");
        }
    }
}
