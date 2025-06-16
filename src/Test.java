public class Test {
    String outerMessage = "Hello from Outer!";

    class Inner {
        void showMessage() {
            System.out.println(outerMessage);
        }
    }

    public static void main(String[] args) {
        Test main = new Test();
        Test.Inner inner = main.new Inner();
        inner.showMessage();
    }
}
