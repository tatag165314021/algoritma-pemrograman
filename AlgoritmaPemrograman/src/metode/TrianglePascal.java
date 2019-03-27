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
public class TrianglePascal {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        int n;

        System.out.print("Masukkan nilai n : ");
        n = data.nextInt();

        for (int i = 0; i <= n; i++) // mencetak C(n,i) mulai i = 0 sampai dengan n
        {
            System.out.print(kombinasi(n, i) + " ");
        }

    }

    static int kombinasi(int n, int r) {
        return faktorial(n) / (faktorial(r) * faktorial(n - r));
    }

    static int faktorial(int n) {
        int hasFak = 1;
        if (n == 0) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                hasFak = hasFak * i;
            }
        }
        return hasFak;
    }

}
