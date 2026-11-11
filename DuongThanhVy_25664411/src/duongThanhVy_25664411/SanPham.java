package duongThanhVy_25664411;

import java.time.LocalDate;

public class SanPham {
	protected String maSP;
	protected String tenSP;
	protected LocalDate nxs;
	protected float giaNhap;
	protected double slTon;
	
	public SanPham(String maSP, String tenSP, LocalDate nxs, float giaNhap, double slTon) {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.nxs = nxs;
		this.giaNhap = giaNhap;
		this.slTon = slTon;
	}
	
	public String getLoai() {
		return "San Pham";
	}
	
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public LocalDate getNxs() {
		return nxs;
	}
	public void setNxs(LocalDate nxs) {
		this.nxs = nxs;
	}
	public float getGiaNhap() {
		return giaNhap;
	}
	public void setGiaNhap(float giaNhap) {
		this.giaNhap = giaNhap;
	}
	public double getSlTon() {
		return slTon;
	}
	public void setSlTon(double slTon) {
		this.slTon = slTon;
	}
	
	public double giaBan() {
		return giaNhap;
	}
	
	@Override
	public String toString() {
		return "SanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", nxs=" + nxs + ", giaNhap=" + giaNhap + "VND" + ", slTon="
				+ slTon;
	}
	
	
}
