package week5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong cong nhan: ");
        int n = sc.nextInt();
        sc.nextLine();

        DanhSachCongNhan ds = new DanhSachCongNhan(n);

        for (int i = 0; i < n; i++) {

            System.out.println("\nNhap cong nhan thu " + (i + 1));

            System.out.print("Ma cong nhan: ");
            int ma = sc.nextInt();
            sc.nextLine();

            System.out.print("Ho: ");
            String ho = sc.nextLine();

            System.out.print("Ten: ");
            String ten = sc.nextLine();

            System.out.print("So san pham: ");
            int soSP = sc.nextInt();

            CongNhan cn = new CongNhan(ma, ho, ten, soSP);

            ds.addCN(cn);
        }
        
        System.out.println("\nDanh sach cong nhan");
        ds.xuatdsCN();

        ds.SapXepGiamDan();

        System.out.println("\nDanh sach da sap xep");
        ds.xuatdsCN();

        sc.close();
    }
}
