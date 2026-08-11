package vn.edu.rikkei.session01.ex02;

import java.util.Scanner;

public class MiniMartPOSBilling {

    public static final double VAT_RATE = 0.08;
    public static final double DISCOUNT_RATE = 0.05;

    static void main(String[] args) {
        System.out.print("--- HỆ THỐNG THU NGÂN MINIMART POS ---\n" +
                "Nhập tên mặt hàng 1: ");
        Scanner scanner = new Scanner(System.in);
        String item1 = scanner.nextLine();
        System.out.print("Nhập giá mặt hàng 1 (VNĐ): ");
        double cost1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập tên mặt hàng 2: ");
        String item2 = scanner.nextLine();
        System.out.print("Nhập giá mặt hàng 2 (VNĐ): ");
        double cost2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập tên mặt hàng 3: ");
        String item3 = scanner.nextLine();
        System.out.print("Nhập giá mặt hàng 3 (VNĐ): ");
        double cost3 = scanner.nextDouble();

        double subTotal = cost1 + cost2;
        subTotal += cost3;
        double vatAmount = subTotal * VAT_RATE;
        double discountAmount = subTotal * DISCOUNT_RATE;
        double totalAmount = subTotal + vatAmount - discountAmount;

        String ke = "=====================================================================\n";

        System.out.print(ke + "                      HÓA ĐƠN THANH TOÁN MINIMART\n" + ke +
                "STT | Tên mặt hàng                   | Thành tiền (VNĐ)\n" +
                "---------------------------------------------------------------------\n");
        System.out.printf("1   | %-30s | %,30.2f %n", item1, cost1);
        System.out.printf("2   | %-30s | %,30.2f %n", item2, cost2);
        System.out.printf("3   | %-30s | %,30.2f %n", item3, cost3);
        System.out.print("---------------------------------------------------------------------\n");

        System.out.printf("%-36s : %,30.2f %n", "TỔNG TIỀN HÀNG (SUBTOTAL)", subTotal);
        System.out.printf("%-36s : %,30.2f %n", "THUẾ GTGT (VAT 8%)", vatAmount);
        System.out.printf("%-36s : %,30.2f %n", "CHIẾT KHẤU THÀNH VIÊN (5%)", -discountAmount);
        System.out.print(ke);
        System.out.printf("%-36s : %,30.2f %n", "TỔNG TIỀN THANH TOÁN (TOTAL)", totalAmount);
        System.out.print(ke + "       Cảm ơn Quý khách & Hẹn gặp lại tại MiniMart!\n" + ke);
    }
}
