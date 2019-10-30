import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        boolean isLeapYear = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap nam ban muon kiem tra");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            isLeapYear = true;
        } else if (year % 100 == 0 && year % 400 != 0) {
            isLeapYear = false;
        } else if (year % 100 == 0 && year % 400 == 0) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }
        if (isLeapYear) {
            System.out.println(year + " la nam nhuan");
        } else {
            System.out.println(year + " khong la nam nhuan");
        }
    }
}
