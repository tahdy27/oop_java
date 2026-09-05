package tuan2.Bai2;

import java.util.Scanner;

public class SinhVienMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //sinh vien 1 co san
        SinhVien sv1 = new SinhVien(11111, "Nguyễn Thanh An", 6.5f, 8.5f);

        //sinh vien 2 co san
        SinhVien sv2 = new SinhVien(22222, "Lê Thị Bông", 7.5f, 8.0f);

        //tao sinh vien 3 moi
        SinhVien sv3 = new SinhVien();
        
        System.out.println("--- Nhập thông tin sinh viên 3 ---");
        System.out.print("Nhập mã SV: ");
        sv3.setMaSV(sc.nextInt());
        sc.nextLine(); //xoa bo dem

        System.out.print("Nhập họ tên: ");
        sv3.setHoTen(sc.nextLine());

        System.out.print("Nhập điểm lý thuyết: ");
        sv3.setDiemLT(sc.nextFloat());

        System.out.print("Nhập điểm thực hành: ");
        sv3.setDiemTH(sc.nextFloat());

        //in bang ket qua
        System.out.println("\nDANH SÁCH SINH VIÊN");
        System.out.println(String.format("%-10s %-30s %10s %10s %10s", 
                           "MSSV", "Họ tên", "Điểm LT", "Điểm TH", "Điểm TB"));
        
        //xuat thong tin sinh vien
        System.out.println(sv1.toString());
        System.out.println(sv2.toString());
        System.out.println(sv3.toString());

        sc.close();
    }
}