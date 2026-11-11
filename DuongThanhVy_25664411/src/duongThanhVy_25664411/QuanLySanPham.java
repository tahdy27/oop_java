package duongThanhVy_25664411;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QuanLySanPham {
	private ArrayList<SanPham> danhSach;
	
	public QuanLySanPham() {
        this.danhSach = new ArrayList<>();
    }

	public QuanLySanPham(ArrayList<SanPham> danhSach) {
		this.danhSach = danhSach;
	}
	
	public SanPham timTheoMa(String maSP) {
        for ( SanPham sp : danhSach)
            if (sp.maSP.equalsIgnoreCase(maSP)) return sp;
        return null;
    }
	
	public boolean themSanPham(SanPham sp) {
		if (sp == null) {
			return false;
		}
		if (timTheoMa(sp.getMaSP()) != null) {
			return false;
		}
        return danhSach.add(sp);
	}
	
	public boolean xoaSanPham(String maSP) {
        return danhSach.removeIf(sp -> sp.getMaSP().equals(maSP));
    }
	
	public boolean suaSoLuongTon(String maSP, int soLuongMoi) {
		SanPham spMoi;
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSP().equals(maSP)) {
            	spMoi = danhSach.get(i);
            	spMoi.setSlTon(soLuongMoi);
                danhSach.set(i, spMoi);                      
                return true;
            }
        }
        return false;
    }
	
	public List<SanPham> xuatSanPhamTheoLoai(String loai) {
        List<SanPham> kq = new ArrayList<>();
        for (SanPham sp : danhSach)
            if (sp.getLoai().equalsIgnoreCase(loai)) kq.add(sp);
        return kq;
    }
	
	public List<SanPham> xuatSanPhamGiaBanCaoNhat() {
        List<SanPham> kq = new ArrayList<>(danhSach);
        kq.sort(Comparator.comparingDouble(SanPham :: giaBan).reversed());
        return kq;
    }
	
	public List<SanPham> layTatCa() {
		return new ArrayList<>(danhSach);
	}
}
