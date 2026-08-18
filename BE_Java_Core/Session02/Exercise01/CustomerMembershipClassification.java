package vn.edu.rikkei.session02.ex01;

import java.util.Scanner;

public class CustomerMembershipClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalSpending = sc.nextDouble();
        boolean isVip = false;
        String level = "";
        double discount = 0.0;


        if (totalSpending < 2000000) {
            level = "Bronze";
            discount = 2.0;
        } else if (totalSpending < 5000000) {
            level = "Silver";
            discount = 5.0;
        } else if (totalSpending < 15000000) {
            level = "Gold";
            discount = 10.0;
            isVip = true;
        } else {
            level = "Diamond";
            discount = 15.0;
            isVip = true;
        }

        if (isVip) {
            System.out.printf("""
                +-------------------------------------------------------+
                |              KẾT QUẢ PHÂN HẠNG THÀNH VIÊN             |
                +-------------------------------------------------------+
                | Tổng chi tiêu:               %.2f VNĐ         |
                | Hạng thẻ thành viên:         %s              |
                | Tỷ lệ chiết khấu ưu đãi:     %.1f%%                    |
                | Nhóm khách hàng:             Khách hàng VIP          |
                +-------------------------------------------------------+""", totalSpending, level, discount);

        }
        else {
            System.out.printf("""
                +-------------------------------------------------------+
                |              KẾT QUẢ PHÂN HẠNG THÀNH VIÊN             |
                +-------------------------------------------------------+
                | Tổng chi tiêu:               %.2f VNĐ         |
                | Hạng thẻ thành viên:         %s              |
                | Tỷ lệ chiết khấu ưu đãi:     %.1f%%                    |
                | Nhóm khách hàng:             Khách hàng Tiêu chuẩn          |
                +-------------------------------------------------------+""", totalSpending, level, discount);
        }
    }
}
