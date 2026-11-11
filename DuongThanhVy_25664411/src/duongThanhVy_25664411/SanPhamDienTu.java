package duongThanhVy_25664411;

import java.time.LocalDate;

public class SanPhamDienTu extends SanPham{
	private int thangBH;
	
	
	public SanPhamDienTu(String maSP, String tenSP, LocalDate nxs, float giaNhap, double slTon, int thangBH) {
		super(maSP, tenSP, nxs, giaNhap, slTon);
		this.thangBH = thangBH;
	}

	public int getThangBH() {
		return thangBH;
	}

	public void setThangBH(int thangBH) {
		this.thangBH = thangBH;
	}

	public double GiaBan() {
		return giaNhap + (giaNhap * 0.1) + (thangBH * 50000);
	}

	
	
	@Override
	public String getLoai() {
		return "Dien tu";
	}
	
	@Override
	public String toString() {
		return super.toString() + ", thangBH=" + thangBH + "]";
	}
}
