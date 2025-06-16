class Car {
    String brand;
    //간단히 쓸 땐 여기에 Engine engine; 입력
    public Car(String brand) {
        this.brand = brand;
        //간단히 쓸 땐 여기에 this.engine = new Engine(); 입력
    }
    class Engine {
        public void start() {
            System.out.println("The engine of " + brand + " is starting.");
        }
    }

    public void startEngine() {
        Engine engine = new Engine(); //간단히 쓸 땐 이걸 제거
        engine.start();
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lamborghini");
        car.startEngine();
    }
}
