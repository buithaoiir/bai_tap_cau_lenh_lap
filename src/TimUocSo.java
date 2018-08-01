import java.util.Scanner;

public class TimUocSo {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = nhap.nextInt();
        System.out.println("Nhap b: ");
        b = nhap.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0)
            System.out.println("Khong co uoc so chung");
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Uoc so chung lon nhat: " + a);
    }

}
