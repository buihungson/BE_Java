package vn.edu.rikkei.session02.ex03;

import java.util.Scanner;

public class LogisticsRevenueAccumulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalRevenue = 0.0;
        int validMonthsCount = 0;

        for(int i = 1 ; i <= 12 ; i++) {
            int revenue = sc.nextInt();
            if (revenue < 100) {
                System.out.printf("Tháng %d có doanh thu < 100M -> Bỏ qua thống kê bình quân.\n", i);
                continue;
            }

            totalRevenue += (revenue);
            validMonthsCount++;
        }

        if (validMonthsCount == 0) System.out.print("Khong hop le");
        else {
            System.out.println(validMonthsCount);
            double binhQuan = totalRevenue / validMonthsCount;

            System.out.printf("%,.2f Triệu VNĐ\n%,.2f Triệu VNĐ\n", totalRevenue, binhQuan);
        }
    }
}
