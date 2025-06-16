class Outer1 {
    private class HiddenInner {
        void secret() {
            System.out.println("private!");
        }
    }

    public void reveal() {
        HiddenInner hi = new HiddenInner();
        hi.secret();
    }
}

public class Hidden {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        outer.reveal();
    }
}