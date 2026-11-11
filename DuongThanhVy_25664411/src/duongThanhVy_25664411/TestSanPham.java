package duongThanhVy_25664411;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestSanPham {
	 public static void main(String[] args) {
		 QuanLySanPham ql = new QuanLySanPham();
		 
		 ql.themSanPham(new SanPhamDienTu("SP01","Noi Com Dien", LocalDate.of(2025, 5, 10), 150000, 35, 6));
		 ql.themSanPham(new SanPhamDienTu("SP02","Noi Ap Suat", LocalDate.of(2026, 8, 20), 230000, 15, 12));
		 ql.themSanPham(new SanPhamDienTu("SP03","May Lanh", LocalDate.of(2026, 10, 30), 2000000, 25, 24));
		 ql.themSanPham(new SanPhamThucPham("SP04","Bap Cai", LocalDate.of(2026, 10, 1), 2000, 205, LocalDate.of(2026, 10, 8)));
		 ql.themSanPham(new SanPhamThucPham("SP05","Trung Ga", LocalDate.of(2026, 10, 15), 18000, 100, LocalDate.of(2026, 11, 1)));
		 
		 ql.layTatCa().forEach(System.out::println);
		 System.out.println("\n");
		 
		 System.out.println("Them San Pham");
		 ql.themSanPham(new SanPhamThucPham("SP06","Trung Ca Tam", LocalDate.of(2026, 10, 1), 1800000, 10, LocalDate.of(2026, 11, 1)));
		 ql.layTatCa().forEach(System.out::println);
		 System.out.println("\n");
		 
		 System.out.println("Xoa San Pham");
		 ql.xoaSanPham("SP01");
		 ql.layTatCa().forEach(System.out::println);
		 System.out.println("\n");
		 
		 System.out.println("Sua So Luong Ton");
		 ql.suaSoLuongTon("SP03", 10);
		 ql.layTatCa().forEach(System.out::println);
		 System.out.println("\n");
		 
		 System.out.println("Xuat San Pham Theo Loai");
		 ql.layTatCa().forEach(System.out::println);
		 System.out.println("\n");
		 
		 System.out.println("Xuat San Pham Co Gia Ban Cao Nhat");
		 ql.xuatSanPhamGiaBanCaoNhat();
		 ql.layTatCa().forEach(System.out::println); 
	 }
}
