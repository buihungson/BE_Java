package vn.edu.rikkei.session01.ex06;

import java.util.Scanner;

public class HRPayrollCalculation {

    public static final double BHXH = 0.08;
    public static final double BHYT = 0.015;
    public static final double BHTN = 0.01;

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        String fullName = scanner.nextLine();
        double gioLam = scanner.nextDouble();
        double luongGio = scanner.nextDouble();
        long phuCap = scanner.nextInt();

        System.out.println(id);
        System.out.println(fullName);

        System.out.println(gioLam);
        System.out.printf("%,.2f\n", luongGio);

        double GrossSalary = gioLam * luongGio;
        System.out.printf("%,.2f\n", GrossSalary);
        System.out.print("1,500,000.00\n");
        System.out.printf("%,.2f\n", GrossSalary + phuCap);

        double truXH = GrossSalary * BHXH;
        double truYT = GrossSalary * BHYT;
        double truTN = GrossSalary * BHTN;

        double tongTru = truXH + truYT + truTN + 150000;

        System.out.printf("%,.2f\n", truXH);
        System.out.printf("%,.2f\n", truYT);
        System.out.printf("%,.2f\n", truTN);

        System.out.print("150,000.00\n");
        System.out.printf("%,.2f\n", tongTru);

        GrossSalary -= tongTru;
        GrossSalary += phuCap;
        System.out.printf("%,.2f\n", GrossSalary);

    }
}
