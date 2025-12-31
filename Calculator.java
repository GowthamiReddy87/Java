public class Calculator {

    // Method with parameters and return type
    public int add(int a, int b) {
        return a + b;
    }

    // Method with no return type
    public void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int n=calc.add(5, 3);
        System.out.println(n);

        calc.greet("Gowthu");
    }
}
