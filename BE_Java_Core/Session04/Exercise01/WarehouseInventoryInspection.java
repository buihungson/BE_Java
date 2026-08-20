package vn.edu.rikkei.session04.ex01;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Arrays;
import java.util.Scanner;

public class WarehouseInventoryInspection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int min = 9999999;
        int total = 0;
        for(int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            total += a[i];
            if(min > a[i]) min = a[i];
        }
        double avg = (double) total / n;
        System.out.println(Arrays.toString(a));
        System.out.printf("%d\n%.2f\n%d", total, avg, min);

    }
}
