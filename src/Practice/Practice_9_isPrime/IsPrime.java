package Practice.Practice_9_isPrime;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true){
            System.out.print("Nhập vào một số nguyên dương: ");
            number = scanner.nextInt();
            if(number >= 0){
                break;
            }
        }
        if(number < 2){
            System.out.printf("%d không phải là số nguyên tố", number);
        }else{
            int i = 2;
            boolean check = true;
            while(i <= Math.sqrt(number)){
                if(number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if(check){
                System.out.printf("%d là số nguyên tố", number);
            }else {
                System.out.printf("%d không phải là số nguyên tố", number);
            }
        }
    }
}
