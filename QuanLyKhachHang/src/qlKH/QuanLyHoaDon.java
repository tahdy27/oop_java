package qlKH;

import java.time.LocalDate;
import java.util.Scanner;

public class QuanLyHoaDon {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("nhap so khach hang toi da: ");
            int n = sc.nextInt();
            DanhSachKhachHang ds = new DanhSachKhachHang(n);
            int chon;
            do {
                System.out.println("------------------------------");
                System.out.println("1/ nhap Khach hang tu ban phim");
                System.out.println("2/ xoa khach hang theo ma khach hang");
                System.out.println("3/ cap nhat don gia theo ma khach hang");
                System.out.println("4/ sap xep danh sach theo ma khach hang");
                System.out.println("5/ in danh sach");
                System.out.println("0/ thoat chuc nang");
                System.out.println("------------------------------");
                System.out.print("nhap lua chon cua ban: ");
                chon = sc.nextInt();
                switch (chon) {
                    case 1: {
                        System.out.print("nhap so khach hang muon nhap: ");
                        int m = sc.nextInt();
                        sc.nextLine();
                        for (int i = 1; i <= m; i++) {
                            System.out.print("nhap ten khach hang: ");
                            String ten = sc.nextLine();
                            System.out.print("nhap ma khach hang: ");
                            String ma = sc.nextLine();
                            System.out.print("nhap so kw cua khach hang: ");
                            double kw = sc.nextDouble();
                            sc.nextLine();
                            KhachHangVietNam KH = new KhachHangVietNam(ten, ma, LocalDate.now(), kw, 50000.0, "", 100000.0);
                            ds.them(KH);
                        }
                        break;
                    }
                    case 2: {
                        System.out.print("nhap ma khach hang muon xoa: ");
                        String ma2 = sc.nextLine();
                        ds.xoa(ma2);
                        break;
                    }
                    case 3: {
                        sc.nextLine();
                        System.out.print("nhap ma khach hang muon muon cap nhat don gia: ");
                        String ma3 = sc.nextLine();
                        System.out.print("nhap don gia moi: ");
                        double gia = sc.nextDouble();
                        ds.capNhat(ma3, gia);
                        break;
                    }
                    case 4:
                        ds.sapXep();
                        break;
                    case 5:
                        ds.in();
                        break;
                }
            } while (chon != 0);
        }
    }
}
