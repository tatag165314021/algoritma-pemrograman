/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metode;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class pascal {

    public static void main(String[] args) {
        int n, i, j;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan tinggi segitiga : ");
        n = input.nextInt();
        int[][] pascal = new int[n+1][n+1];
        for (i = 1; i <= n; i++) {//selama i sampai n
            for (j = n; j > i; j--) {//j adalah n selama j lebih dari i  
                System.out.print("   "); //cetak spasi
            }
            for (j = 1; j <= i; j++) {
                if (i == 0 || j == i) {
                    pascal[i][j] = 1;
                    System.out.print("  " + pascal[i][j] + "   ");
                } 
                else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                    if (pascal[i][j] > 99) {
                        System.out.print("  " + pascal[j][j] + " ");
                    } 
                    else if (pascal[i][j] > 9) {
                        System.out.print("  " + pascal[i][j] + "  ");
                    } 
                    else {
                        System.out.print("  " + pascal[i][j] + "   ");
                    }
                }
            }
            System.out.println();
        }

    }
}
