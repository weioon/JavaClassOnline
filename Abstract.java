import java.util.Scanner;

abstract class Car{
    public abstract int getPrice();
    public abstract String getSlogan();
}

class Toyota extends Car{
    @Override
    public int getPrice(){
        return 25000;
    }
    @Override
    public String getSlogan() {
        return "Let's Go Places!";
    }
}

class BMW extends Car{
    @Override
    public int getPrice(){
        return 85000;
    }
    @Override
    public String getSlogan() {
        return "The Ultimate Driving Machine.";
    }
}

class Tesla extends Car{
    @Override
    public int getPrice(){
        return 75000;
    }
    @Override
    public String getSlogan() {
        return "Electric Cars, Infinite Possibilities.";
    }
}

public class Abstract {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the car name (BMW, Toyota, Tesla): ");
        String carName = scan.nextLine();

        Car car;
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

    System.out.println(car.getSlogan());        
        System.out.println("The price of " + carName + " is RM." + car.getPrice());
    }
}
