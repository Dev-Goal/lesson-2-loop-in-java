package Practice.Practice_10_Interest_Rate;

import java.util.Scanner;

public class Interest_Rate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double loanMoney, interRate, interMoney = 0;
        byte month;
        System.out.print("Nhập số tiền khách hàng vay: ");
        while (true){
            loanMoney = scanner.nextDouble();
            if(loanMoney >= 10000000){
                break;
            }else{
                System.out.print("Khoản vay tối thiểu phải là 10000000VND: ");
            }
        }
        System.out.print("Nhập vào thời gian vay (tháng): ");
        month = scanner.nextByte();
        System.out.print("Nhập vào lãi suất: ");
        interRate = scanner.nextDouble();
        for(int i = 0; i < month; i++){
            interMoney += loanMoney *(interRate/100)/12 * month;
        }
        System.out.printf("Số tiền lãi của %s VND là %s VND", loanMoney, interMoney);
    }
}
