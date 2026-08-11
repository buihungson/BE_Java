package vn.edu.rikkei.session01.ex05;

import java.util.Scanner;

public class HotelBookingFeeCalculator {

    public static final double VAT_RATE = 0.10;
    public static final double SERVICE_RATE = 0.05;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String roomID = scanner.nextLine();
        String fullName = scanner.nextLine();
        double roomRate = scanner.nextDouble();
        int nights = scanner.nextInt();
        double serviceCost = scanner.nextDouble();
        boolean isVip = scanner.nextBoolean();

        double roomCost = roomRate * nights;
        double totalCost = roomCost;
        totalCost += serviceCost;

        double vatAmount = totalCost * VAT_RATE;
        double serviceAmount = totalCost * SERVICE_RATE;

        double totalAmount = totalCost + vatAmount + serviceAmount;

        System.out.println(roomID);
        System.out.println(fullName);
        System.out.printf("%,.2f\n", roomCost);
        System.out.printf("%,.2f\n", serviceCost);
        System.out.printf("%,.2f\n", totalCost);
        System.out.printf("%,.2f\n", vatAmount);
        System.out.printf("%,.2f\n", serviceAmount);

        System.out.printf("%,.2f\n", totalAmount);

        boolean isSpecial = isVip && nights >= 3;
        System.out.println(isSpecial);

    }
}
