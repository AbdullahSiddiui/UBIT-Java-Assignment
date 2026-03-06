import java.util.Scanner;

public class Onlineclass2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] m = new int[n][n];


        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                m[i][j] = sc.nextInt();
            }
        }

        // Row sums
        for(int i = 0; i < n; i++){
            int rowSum = 0;
            for(int j = 0; j < n; j++){
                rowSum += m[i][j];
            }
            System.out.println("Sum of Row " + (i+1) + " = " + rowSum);
        }

        // Column sums
        for(int j = 0; j < n; j++){
            int colSum = 0;
            for(int i = 0; i < n; i++){
                colSum += m[i][j];
            }
            System.out.println("Sum of Column " + (j+1) + " = " + colSum);
        }

        int diag = 0;
        int revDiag = 0;

        for(int i = 0; i < n; i++){
            diag += m[i][i];
            revDiag += m[i][n-1-i];
        }

        System.out.println("Diagonal Sum = " + diag);
        System.out.println("Reverse Diagonal Sum = " + revDiag);

        sc.close();
    }
}