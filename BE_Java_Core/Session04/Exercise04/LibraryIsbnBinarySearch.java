package vn.edu.rikkei.session04.ex04;
import java.util.Scanner;
public class LibraryIsbnBinarySearch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] isbnList = {101, 105, 110, 125, 140, 155, 170, 188, 195, 200};
        System.out.print("Nhập mã ISBN cần tra cứu:");
        int targetIsbn = sc.nextInt();
        int left = 0, right = isbnList.length - 1;
        boolean flag = false;
        int mid = 0;
        int step = 0;
        while(left <= right) {
            mid = (left + right) / 2;
            step++;
            if(isbnList[mid] == targetIsbn) {
                flag = true;
                break;
            }
            else if(targetIsbn > isbnList[mid]) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        if(flag) {
            System.out.printf("%d %d", mid, step);
        } else {
            System.err.println("999");
        }
    }
}
