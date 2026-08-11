package vn.edu.rikkei.session01.ex03;

import java.util.Scanner;

public class CurrencyExchangeCasting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usdRate = scanner.nextDouble();
        double eurRate = scanner.nextDouble();
        double usdAmount = scanner.nextDouble();
        double eurAmount = scanner.nextDouble();

        double totalUsd = usdRate * usdAmount;
        double totalEur = eurRate * eurAmount;
        double totalVnd = totalEur + totalUsd;

        long officalVndAmount = (long) totalVnd;
        double truncationLoss = totalVnd - officalVndAmount;

        double auditReportValue = officalVndAmount;

        System.out.printf("%,.2f\n", totalUsd);
        System.out.printf("%,.2f\n", totalEur);
        System.out.printf("%,.2f\n", totalVnd);

        System.out.printf("%,d\n", officalVndAmount);
        System.out.printf("%,.2f\n", truncationLoss);
        System.out.printf("%,.2f\n", auditReportValue);

        long soTo = officalVndAmount / 500000;
        long phanDu = officalVndAmount % 500000;
        System.out.printf("%d\n", soTo);
        System.out.printf("%,d\n", phanDu);

    }
}
