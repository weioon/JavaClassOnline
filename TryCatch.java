import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Please select the optional number for the below list\n 1. You have to enter the value for the 3*4 matrix.\n 2. You have to enter the value for the 2*3 matrix.");
        num = scan.nextInt();
        try {
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
                int count = 0;

                while (true) {
                    System.out.println("Please enter the value for row " + (count / 3) + " column " + (count % 3) + ":");
                    matrix2[count / 3][count % 3] = scan.nextInt();
                    count++;

                    if (count >= 6) {
                        System.out.println("You have entered the maximum valid values for this matrix. Trying to enter more will cause an error.");
                    }

                    if (count == 7) { 
                        System.out.println("Attempting to input more values than the matrix can hold...");
                        matrix2[2][0] = scan.nextInt();  
                        matrix2[2][1] = scan.nextInt();
                    }
                }
            default:
                throw new AssertionError();
        }//switch
       
    }//try
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("ArrayIndexOutOfBoundsException: You have tried to input more values than the matrix can hold.");
    }
    }//main
    }//class

