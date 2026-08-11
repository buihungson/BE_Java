package vn.edu.rikkei.session01.ex04;

import java.util.Scanner;

public class LogisticsFleetSafetyCheck {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String truckID = scanner.nextLine();
        double currentFuel = scanner.nextDouble();
        double efficiency = scanner.nextDouble();
        double currentWeight = scanner.nextDouble();
        double maxWeight = scanner.nextDouble();
        boolean isMaintained = scanner.nextBoolean();

        int inspectionCount = 1;

        double maxDistance = currentFuel * efficiency;
        boolean isFuelOk = maxDistance >= 200;

        boolean isWeightOk = currentWeight <= maxWeight;

        boolean isReady = isFuelOk && isWeightOk && isMaintained;

        boolean isWarning = (currentWeight > maxWeight) || (currentFuel < 30.0);

        System.out.println(truckID);
        System.out.println(maxDistance);
        System.out.println(isFuelOk);
        System.out.println(isWeightOk);
        System.out.println(isMaintained);
        System.out.println(isWarning);
        System.out.println(isReady);

        System.out.println(inspectionCount++);

        System.out.println(++inspectionCount);

    }
}
