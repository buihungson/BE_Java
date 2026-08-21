package vn.edu.rikkei.session04.ex03;
import java.util.Scanner;
public class WeatherStationTemperatureMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] a = new double[7][3];
        for(int i = 0 ; i < 7 ; i++) {
            double avgDay = 0;
            for(int j = 0 ; j < 3 ; j++) {
                a[i][j] = sc.nextDouble();
                avgDay += a[i][j];
            }
            System.out.printf("%.2f °C\n", avgDay / 3);
        }
        double avgWeek = 0;
        for(int i = 0 ; i < 3 ; i++) {
            double avgHour = 0;
            for(int j = 0 ; j < 7 ; j++) {
                avgHour += a[j][i];
            }
            avgWeek += avgHour / 7;
            System.out.printf("%.2f °C ", avgHour / 7);
        }
        System.out.printf("%.2f °C\n", avgWeek / 3);
    }
}
