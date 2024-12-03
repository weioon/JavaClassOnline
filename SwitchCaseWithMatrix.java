import java.util.*;

public class SwitchCaseWithMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Please select the optional number for the below list\n 1. You have to enter the value for the 3*4 matrix.\n 2. You have to enter the value for the 2*3 matrix.");
        num = scan.nextInt();
        switch (num) {
            case 1:
                int[][] matrix = new int[3][4];
           
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 4; j++){
                        System.out.println("Please enter the value for row " + i  + " column " + j + ":");
                        matrix[i][j] = scan.nextInt();
                        
                    }
                }
                System.out.println("The given matrix is:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
                case 2:
                int[][] matrix2 = new int[2][3];
              
                for(int i = 0; i < 2; i++){
                    for(int j = 0; j < 3; j++){
                        System.out.println("Please enter the value for row " + i  + " column " + j + ":");
                        matrix2[i][j] = scan.nextInt();
                        
                    }
                }
                System.out.println("The given matrix is:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(matrix2[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            default:
                throw new AssertionError();
        }
    }
}
