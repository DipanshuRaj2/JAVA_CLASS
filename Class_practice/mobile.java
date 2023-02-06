// package Class_practice;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        if (rows <= 0) {
            System.out.println("Invalid Rows");
        } else {
            for (int i = rows; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("@");
                }
                System.out.println();
            }
            }
}
}