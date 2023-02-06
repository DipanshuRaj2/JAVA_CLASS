import java.util.*;

class ArrayUser {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows :- ");
        int rows = sc.nextInt();
        int arr[][] = new int[rows][];
        System.out.println("Enter the no. of Columns:- ");
        for (int i = 0; i < rows; i++) { // WE can also use arr.length this will same as introws
            int c = sc.nextInt();
            arr[i] = new int[c];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; i < arr[i].length; i++) {

                int value = sc.nextInt();
                arr[i][j] = value;

            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; i < arr[i].length; i++)
                System.out.println(arr[i][j]);
        }
    }
}
