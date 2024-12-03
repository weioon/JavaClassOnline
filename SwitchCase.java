import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dayNum;
        System.out.print("Please enter the day number:");
        dayNum = scan.nextInt();
        switch(dayNum){
            case 1:
            System.out.println("The number that you enter is Monday");
            break;
            case 2:
            System.out.println("The number that you enter is Tuesday");
            break;
            case 3:
            System.out.println("The number that you enter is Wednesday");
            break;
            case 4:
            System.out.println("The number that you enter is Thursday");
            break;
            case 5:
            System.out.println("The number that you enter is Friday");
            break;
            case 6:
            System.out.println("The number that you enter is Saturday");
            break;
            case 7:
            System.out.println("The number that you enter is Sunday");
            break;
            default:
            System.out.println("The number that you enter is invalid day. Please try again!");
        }
    }
    
}
