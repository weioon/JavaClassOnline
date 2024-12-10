import java.util.Scanner;

class Car{
    public int getPrice(){
        return 0;
    }
}

class Toyota extends Car{
    @Override
    public int getPrice(){
        return 25000;
    }
}

class BMW extends Car{
    @Override
    public int getPrice(){
        return 85000;
    }
}

class Tesla extends Car{
    @Override
    public int getPrice(){
        return 75000;
    }
}

public class Polymorphysm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the car name (BMW, Toyota, Tesla): ");
        String carName = scan.nextLine();

        Car car = new Car();
        switch (carName.toLowerCase()) {
            case "toyota":
                car = new Toyota();
                break;
            case "bmw":
                car = new BMW();
                break;
            case "tesla":
                car = new Tesla();
                break;
            default:
                System.out.println("Invalid car name entered.");
                return;
        }

        
        System.out.println("The price of " + carName + " is RM." + car.getPrice());
    }
}
