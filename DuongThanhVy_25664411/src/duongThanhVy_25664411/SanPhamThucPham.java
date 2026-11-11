package duongThanhVy_25664411;

import java.time.LocalDate;

public class SanPhamThucPham extends SanPham{
	private LocalDate nhh;
	
	public SanPhamThucPham(String maSP, String tenSP, LocalDate nxs, float giaNhap, double slTon, LocalDate nhh) {
		super(maSP, tenSP, nxs, giaNhap, slTon);
		this.nhh = nhh;
	}

	public LocalDate getNhh() {
		return nhh;
	}

	public void setNhh(LocalDate nhh) {
		this.nhh = nhh;
	}

	public double GiaBan() {
		if (nhh.isBefore(nxs)) {
			return 0;
		}
		
		return giaNhap + (giaNhap * 0.05);
	}

	
	@Override
	public String getLoai() {
		return "Thuc pham";
	}
	
	@Override
	public String toString() {
		return super.toString() + ", nhh=" + nhh + "]";
	}
}
