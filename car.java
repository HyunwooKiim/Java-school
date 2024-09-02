class Car {
    int seat;
    int door;
    static String Cars = "car";
    String form;
}

public class Main {

    public static void main(String[] args) {
        System.out.println("This is " + Car.Cars);
        Car [] car = new Car[3];

        for(int i = 0; i < 3; i++) {
            car[i] = new Car();
        }

        car[0].seat = 4;
        car[0].door = 4;
        car[0].form = "그냥 차";
        System.out.println(car[0].seat);
        System.out.println(car[0].door);
        System.out.println(car[0].form);

        car[1].seat = 20;
        car[1].door = 2;
        car[1].form = "버스";
        System.out.println(car[1].seat);
        System.out.println(car[1].door);
        System.out.println(car[1].form);

        car[2].seat = 10001;
        car[2].door = 2;
        car[2].form = "내 정신상태";
        System.out.println(car[2].seat);
        System.out.println(car[2].door);
        System.out.println(car[2].form);

        System.out.println("---");

        for(int i = 0; i < 3; i++) {
            System.out.println(car[i].seat);
            System.out.println(car[i].door);
            System.out.println(car[i].form);
        }
    }
}
