package vn.edu.rikkei.session02.ex04;

import java.util.Scanner;

public class SecurityPinAuthentication {
    public static final String SECRET_PIN = "889900";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxAttempts = 0;
        while(maxAttempts < 3) {
            System.out.printf("[Lần %d/3] Nhập mã PIN bảo mật:", maxAttempts + 1);
            String pass = sc.nextLine();
            if(pass.equals(SECRET_PIN)) {
                System.out.println("+-------------------------------------------------------+\n" +
                        "|  XÁC THỰC THÀNH CÔNG — CHÀO MỪNG QUẢN TRỊ VIÊN!       |\n" +
                        "+-------------------------------------------------------+\n");
                break;
            }

            maxAttempts++;
            if (maxAttempts == 3) {
                System.out.println("Bi khoa");
            } else {
                System.out.printf("=> Mật khẩu không chính xác! Bạn còn %d lần thử.\n", 3 - maxAttempts);
            }
        }
    }
}

