package tuan2.Bai2;

public class SinhVien {
    //dong goi 
    private int maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;

   //Constructor
    public SinhVien() {
        this.setMaSV(0);
        this.setHoTen("");
        this.setDiemLT(0.0f);
        this.setDiemTH(0.0f);
    }

    //Constructor day du
    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
        this.setMaSV(maSV);
        this.setHoTen(hoTen);
        this.setDiemLT(diemLT);
        this.setDiemTH(diemTH);
    }

    //Getter_Setter
    
    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int ma) {
        if (ma > 0) {
            this.maSV = ma;
        } else {
            this.maSV = 0;
        }
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String ten) {
        if (ten != null && !ten.trim().isEmpty()) {
            this.hoTen = ten;
        } else {
            this.hoTen = "Chưa xác định";
        }
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float lt) {
        if (lt >= 0 && lt <= 10) {
            this.diemLT = lt;
        } else {
            this.diemLT = 0;
        }
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float th) {
        if (th >= 0 && th <= 10) {
            this.diemTH = th;
        } else {
            this.diemTH = 0;
        }
    }

    //tinh diem trung binh
    public float tinhDiemTB() {
        return (diemLT + diemTH) / 2;
    }

    // toString hien thi thong tin
    @Override //annotation
    public String toString() {
        return String.format("%-10d %-30s %10.2f %10.2f %10.2f", 
                             maSV, hoTen, diemLT, diemTH, tinhDiemTB());
    }
}