public class Outer {
    private String message = "Hello, Outer Class!";
    //InnerClass 클래스에서도 접근 가능

    class InnerClass {
        void displayMessage() {
            System.out.println("Inner says: " + message);
        }
    }
    public void callInner() { //외부에서 내부 클래스를 사용
        InnerClass inner = new InnerClass();
        inner.displayMessage();
    }
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.callInner();
    }
}