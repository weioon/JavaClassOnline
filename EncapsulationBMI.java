import java.util.Scanner;

public class EncapsulationBMI {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void steAge(int age){
        this.age = age;
    }
    public double calculateBMI(int height,int weight){
        double bmi  = (height-100)/weight;
        return bmi;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        EncapsulationBMI person = new EncapsulationBMI();

        System.out.print("Please enter your name:");
        person.setName( scan.nextLine());
        System.out.print("Please enter your age:");
        person.steAge(scan.nextInt());
        System.out.print("Please enter your height(in CM):");
        int height = scan.nextInt();
        System.out.print("Please enter your weight(in KG):");
        int weight = scan.nextInt();
        System.out.println("Your name is " + person.getName() + " and you age is " + person.getAge() + " and your BMI value is " + person.calculateBMI(height, weight));
    }
}
