package Exercise.Exercise_13_System_Type_Shapes;

import java.util.Scanner;

public class System_Type_Shapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Vẽ Hình Chữ Nhật");
            System.out.println("2. Vẽ Hình Tam Giác");
            System.out.println("3. Vẽ Tam Giác Cân");
            System.out.println("4. Thoát");
            System.out.print("Chọn hình bạn muỗn vẽ: ");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 8; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Tam giác botton-left");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Tam giác button-right");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Tam giác top-left");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Tam giác top-right");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 5; k >= i; k--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Tam giác cân");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5 - i; j >= 1; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j < i * 2; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Bạn chưa chọn mục");
            }
        }
    }
}
