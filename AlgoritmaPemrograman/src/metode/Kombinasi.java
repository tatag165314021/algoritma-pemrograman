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
public class Kombinasi {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        int n, r, nfak, rfak, nrfak, komb;
        try {
            do {
                System.out.print("Masukkan nilai n = ");
                n = data.nextInt();
                System.out.print("Masukkan nilai r = ");
                r = data.nextInt();

                nfak = faktorial(n);
                rfak = faktorial(r);
                nrfak = faktorial(n - r);

                System.out.println("Nilai dari n!       = " + nfak);
                System.out.println("Nilai dari r!       = " + rfak);
                System.out.println("Nilai dari n-r !    = " + nrfak);
                komb = kombinasi(n, r);
                System.out.println("Nilai combinasi     = " + komb);
            } while (n <= r);
        } catch (Exception e) {
            System.out.println("pembagian bilangan nol!");

        }
    }

    static int kombinasi(int n, int r) {
        return faktorial(n) / (faktorial(r) * faktorial(n - r));
    }

    static int faktorial(int n) {
        int hasFak = 1;
        if (n == 0) {
            return 0;
        } else {
            for (int i = 1; i <= n; i++) {
                hasFak = hasFak * i;
            }
        }
        return hasFak;
    }

}
