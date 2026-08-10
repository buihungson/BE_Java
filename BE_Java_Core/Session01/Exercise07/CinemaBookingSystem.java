package vn.edu.rikkei.session01.ex07;

import java.util.Scanner;

public class CinemaBookingSystem {

    public static final double ADULT_PRICE = 85000.0;
    public static final double STUDENT_PRICE = 55000.0;
    public static final double VAT_RATE = 0.08;

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.print("--- HỆ THỐNG ĐẶT VÉ RIKKEI CINEMA ---\n" + "Nhập mã giao dịch             : ");
    String maGD = scanner.nextLine();
    System.out.print("Nhập họ và tên khách hàng     : ");
    String Hoten = scanner.nextLine();
    System.out.print("Nhập số lượng vé Người lớn    : ");
    int adultCount = scanner.nextInt();
    System.out.print("Nhập số lượng vé Học sinh     : ");
    int studentCount = scanner.nextInt();
    System.out.print("Nhập số lượng combo bắp nước  : ");
    int comboCount = scanner.nextInt();
    System.out.print("Nhập đơn giá combo (VNĐ)      : ");
    double comboPrice = scanner.nextDouble();
    System.out.print("Nhập thẻ thành viên VIP (true/false): ");
    boolean isVip = scanner.nextBoolean();



    int totalTickets = adultCount + studentCount;
    double price = (adultCount * ADULT_PRICE) + (studentCount * STUDENT_PRICE);
    double comboTotal = comboCount * comboPrice;
    double subTotal = price + comboTotal;
    double vatAmount = subTotal * VAT_RATE;
    double totalAmount = subTotal + vatAmount;

    long gatewayPayment =  (long) totalAmount;

    boolean isPoster = (totalAmount >= 300000.0) || (totalTickets >= 4);
    boolean isLuckyDraw = (isVip) && (totalAmount >= 200000.0);

        System.out.print("=====================================================================\n" +
                "               HÓA ĐƠN ĐẶT VÉ RIKKEI CINEMA\n" +
                "=====================================================================\n");
        System.out.print("Mã giao dịch       : " + maGD + "\n");
        System.out.print("Khách hàng         : " + Hoten);
        System.out.printf(" | Thẻ VIP: %b\n", isVip);
        System.out.print("---------------------------------------------------------------------\n" +
                "1. CHI TIẾT VÉ & DỊCH VỤ (SUBTOTAL)\n");
        System.out.printf("  - Vé người lớn (%d x 85,000)        :                %,.2f VNĐ\n", adultCount, adultCount * ADULT_PRICE);
        System.out.printf("  - Vé Học sinh/SV (%d x 55,000)      :                %,.2f VNĐ\n", studentCount, studentCount * STUDENT_PRICE);
        System.out.printf("  - Combo bắp nước (%d x %,.0f)      :                %,.2f VNĐ\n", comboCount, comboPrice, comboTotal);
        System.out.printf("  -> Tổng trước thuế                 :                %,.2f VNĐ\n", subTotal);
        System.out.printf("2. THUẾ GTGT (VAT 8%%)                :                %,.2f VNĐ\n", vatAmount);
        System.out.print("---------------------------------------------------------------------\n");
        System.out.printf("TỔNG THANH TOÁN (DOUBLE)             :                %,.2f VNĐ\n", totalAmount);
        System.out.print("=====================================================================\n");
        System.out.printf("SỐ TIỀN CHỐT CỔNG THANH TOÁN (LONG)  :                %,d VNĐ\n", gatewayPayment);
        System.out.print("=====================================================================\n" + "QUYỀN LỢI & ƯU ĐÃI KHÁCH HÀNG:\n");

        System.out.print("- Đủ điều kiện nhận Poster phim (>=300k/4 vé): " + isPoster + "\n");
        System.out.println("- Đủ điều kiện Vòng quay may mắn (VIP & >=200k): " + isLuckyDraw);
        System.out.print("=====================================================================\n" +
                "        Chúc Quý khách xem phim vui vẻ tại Rikkei Cinema!\n" +
                "=====================================================================");
    }
}
