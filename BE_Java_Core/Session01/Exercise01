package vn.edu.rikkei.session01.ex01;

import java.util.Scanner;

public class LibraryCardRegistration {
    static void main(String[] args) {
        System.out.print("--- HỆ THỐNG ĐĂNG KÝ THẺ THƯ VIỆN SỐ ---\n" +
                "Nhập mã thẻ độc giả: ");
        Scanner scanner = new Scanner(System.in);
        String cardID = scanner.nextLine();
        System.out.print("Nhập họ và tên: ");
        String fullName = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập giới tính (Nam/Nữ): ");
        String gender = scanner.nextLine();
//        Khi nhập nextInt bình thường, age lấy số gán vào, còn ký tự \n thì chạy xuống nextLine, mà nextLine lại
//        kết thúc khi nhập \n nên sẽ lỗi, ta dùng nextLine để nuốt của số lẫn \n sau do chuyen lai ve Int.

        System.out.print("Nhập tiền đặt cọc (VNĐ): ");
        double depositAmount = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập email liên hệ: ");
        String email = scanner.nextLine();

        System.out.print("+-------------------------------------------------------------------+\n" +
                "|               PHIẾU XÁC NHẬN ĐĂNG KÝ THẺ ĐỘC GIẢ                  |\n" +
                "+-------------------------------------------------------------------+\n");
        String rowFormat = "| %-15s : %-47s |%n";
        System.out.printf(rowFormat, "Mã Thẻ", cardID);
        System.out.printf(rowFormat, "Họ và tên", fullName);
        System.out.printf(rowFormat, "Tuổi", age);
        System.out.printf(rowFormat, "Giới tính", gender);
        System.out.printf(rowFormat, "Tiền đặt cọc", depositAmount);
        System.out.printf(rowFormat, "Email liên hệ", email);
        System.out.print("+-------------------------------------------------------------------+\n" +
                "| Trạng thái     : THÀNH CÔNG - Hợp lệ kích hoạt thẻ thư viện       |\n" +
                "+-------------------------------------------------------------------+");
    }
}
