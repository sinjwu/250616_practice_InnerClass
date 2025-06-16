public class Outer2 {
    private String data = "Outer data";

    class Inner {
        void printData() {
            System.out.println(data);
        }
    }
    public Inner createInner() {
        return new Inner();
    }
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        Outer2.Inner inner = outer.createInner();
        inner.printData();

        outer = null;
        inner = null;

        System.gc();
        System.out.println("Outer와 Inner는 더 이상 사용되지 않음");
    }
}
