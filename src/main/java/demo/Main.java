package demo;

public class Main {

    public void show() {
        System.out.println("Hello!!");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.show();
        System.out.println("addition is: " + m.add(5, 10));
        System.out.println("Subtraction is: " + m.sub(5, 10));
        System.out.println("multiplication is: " + m.mul(5, 10));
        System.out.println("division is: " + m.div(5, 10));
    }
}

