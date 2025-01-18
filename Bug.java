public class MyClass {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int k = i / j; // This line will throw an ArithmeticException
        System.out.println(k);
    }
}