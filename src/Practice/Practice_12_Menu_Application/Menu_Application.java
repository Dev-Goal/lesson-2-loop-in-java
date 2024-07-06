package Practice.Practice_12_Menu_Application;

import java.util.Scanner;

public class Menu_Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte number;
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Vẽ Hình Chữ Nhật");
            System.out.println("2. Vẽ Hình vuông");
            System.out.println("3. Vẽ hình tam giác");
            System.out.println("4: Thoát");
            System.out.print("Chọn mục mà bạn muốn vẽ: ");
            number = scanner.nextByte();

            switch (number) {
                case 1:
                    System.out.println("1. Vẽ Hình Chữ Nhật");
                    System.out.println("---------------------");
                    System.out.println("* * * * * * * * * *");
                    System.out.println("* * * * * * * * * *");
                    System.out.println("* * * * * * * * * *");
                    System.out.println("* * * * * * * * * *");
                    break;
                case 2:
                    System.out.println("2. Vẽ Hình Vuông");
                    System.out.println("---------------------");
                    System.out.println(" * * * * * * * * ");
                    System.out.println(" * * * * * * * * ");
                    System.out.println(" * * * * * * * * ");
                    System.out.println(" * * * * * * * * ");
                    System.out.println(" * * * * * * * * ");
                    System.out.println(" * * * * * * * * ");
                    System.out.println(" * * * * * * * * ");
                    System.out.println(" * * * * * * * * ");
                    break;
                case 3:
                    System.out.println("3. Vẽ Hình Tam Giác");
                    System.out.println("---------------------");
                    System.out.println("     *     ");
                    System.out.println("    ***    ");
                    System.out.println("   *****   ");
                    System.out.println("  *******  ");
                    System.out.println(" ********* ");
                    System.out.println("***********");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Bạn chưa chọn mục");
            }
        }
    }
}
