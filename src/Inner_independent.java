class Outer3 {
    static class StaticInner {
        void hello() {
            System.out.println("Hi!");
        }
    }
}

public class Inner_independent {
    public static void main(String[] args) {
        Outer3.StaticInner inner = new Outer3.StaticInner();
        inner.hello();
    }
}
