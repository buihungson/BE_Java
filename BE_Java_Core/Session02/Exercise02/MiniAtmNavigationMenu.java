package vn.edu.rikkei.session02.ex02;

import java.util.Scanner;

public class MiniAtmNavigationMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000000.0;
        int input;
        do {
            System.out.println("--- MENU GIAO DỊCH ATM MINI ---\n" +
                    "1. Xem số dư | 2. Nộp tiền | 3. Rút tiền | 4. Thoát");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.printf("%,.2f VNĐ\n", balance);
                    break;
                case 2:
                    int nop = sc.nextInt();
                    if (nop > 0) balance += nop;
                    break;
                case 3:
                    int rut = sc.nextInt();
                    if(rut > 0 && rut <= balance) balance -= rut;
                    break;
            }

        } while(input != 4);
    }
}
