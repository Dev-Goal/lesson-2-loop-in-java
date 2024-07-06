package Practice.Practice_11_Find_Divisor_Greatest;

import java.util.Scanner;

public class Find_Divisor_Greatest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.print("Nhập a: ");
        a = scanner.nextInt();
        System.out.print("Nhập b: ");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);

        if(a == 0 || b == 0){
            System.out.println("Hai số không có ước chung");
        }
        while (a != b){
            if(a > b){
                a = a - b;
            }else{
                b = b - a;
            }
        }
        System.out.printf("Ưóc chung lớn nhất của 2 số là %d", a);
    }
}
