package qlSV;

import java.util.List;

public interface IFSinhVien {
	boolean them(SinhVien sv);
	boolean sua(String maSV, SinhVien svMoi);
	boolean xoa(String maSV);
	boolean xoaTatCa();
	
	List<SinhVien> LayTatCa();
	SinhVien timTheoMa(String maSV);
	List<SinhVien> timTheoTen(String tuKhoa);
	List<SinhVien> timTheoLoai(String loai);
	List<SinhVien> timTheoMon(MonHoc monHoc);
	
	int tongSoLuong();
	double tongThanhTien();
	
	List<SinhVien> sapXepTheoTen();
	List<SinhVien> sapXepTheoThanhTienGiamDan();
}
