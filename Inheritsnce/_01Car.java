class Tesla extends _01Car
{
    String batteryType;
    int range;

    void display1() {
        System.out.println("Child Class Display Method");
        // super.display();
        System.out.println("Tesla Battery Type: " + batteryType);
        System.out.println("Tesla Range: " + range);
    }
}

public class _01Car {
    String color;
    int price;
    String model;
    String brand;
    void display() {
        System.out.println("Parent Class Display Method");
        System.out.println("Car Color: " + color);
        System.out.println("Car Price: " + price);
        System.out.println("Car Model: " + model);
        System.out.println("Car Brand: " + brand);
    }
    public static void main (String[] args) {
        System.out.println("Welcome to Our Showroom");
        // _01Car car1 = new _01Car();
        // car1.color = "Red";
        // car1.price = 50000;
        // car1.model = "Sedan";   
        // car1.brand = "Toyota";
        // car1.display();
        Tesla tesla1 = new Tesla();
        tesla1.color = "White";
        tesla1.price = 80000;
        tesla1.model = "Model S";
        tesla1.brand = "Tesla";
        tesla1.batteryType = "Lithium-Ion";
        tesla1.range = 370;
        tesla1.display();
        tesla1.display1();
    }
}



