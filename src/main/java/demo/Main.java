package demo;

public class Main {
    public int sum(int a, int b) {
        return a+b;
    }
    public int sub(int a, int b) {
        return a-b;
    }
    public int mul(int a, int b) {
        return a*b;
    }
    public int div(int a, int b) {
        return a/b;
    }
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println("Sum is: "+m.sum(20, 10));
        System.out.println("Sub is: "+m.sub(20, 10));
        System.out.println("mul is: "+m.mul(20, 10));
        System.out.println("div is: "+m.div(20, 10));
    }
}