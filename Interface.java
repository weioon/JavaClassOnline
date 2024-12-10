
interface Car{
    void message();

}

class Toyota implements Car{
    public void message(){
        System.out.println("BMW is one of the economic car in the world");
    }
}

class BMW implements Car{
    public void message(){
        System.out.println("BMW is one of the coolest car in the world");
    }
}

class Tesla implements Car{
    public void message(){
        System.out.println("Yes Tesla is the best electric car");
    }
}
public class Interface {
   public static void main(String[] args) {
       Car car1 = new Toyota();
       car1.message();
       Car car2 = new BMW();
       car1.message();
       Car car3 = new Tesla();
       car3.message();
   } 
}
