package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array rows: ");
        int arrRows = sc.nextInt();
        System.out.print("Enter array cols: ");
        int arrCols = sc.nextInt();
        int [][] arr = new int[arrRows][arrCols];
        for(int i = 0; i < arrRows; i++) {
            for(int j = 0; j < arrCols; j++) {
                System.out.print("Enter array item: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("You entered an array: ");
        for(int i = 0; i < arrRows; i++) {
            for(int j = 0; j < arrCols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
