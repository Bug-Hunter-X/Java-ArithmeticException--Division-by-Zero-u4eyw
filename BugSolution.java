public class MyClass {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int k = 0;
        if (j != 0) {
            k = i / j; 
        } else {
            System.out.println("Cannot divide by zero");
        }
        System.out.println(k);
    }
}