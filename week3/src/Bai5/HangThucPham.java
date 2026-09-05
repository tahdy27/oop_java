package Bai5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;

public class HangThucPham {
    // Thuộc tính
    private final String maHang; // Không cho phép sửa (dùng final)
    private String tenHang;
    private double donGia;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;

    // --- Câu a: Setters và Getters ---

    public String getMaHang() {
        return maHang;
    }

    // Không viết setter cho maHang vì yêu cầu không cho phép sửa

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if (tenHang == null || tenHang.trim().isEmpty()) {
            this.tenHang = "xxx"; // Mặc định nếu rỗng
        } else {
            this.tenHang = tenHang;
        }
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia >= 0) {
            this.donGia = donGia;
        } else {
            this.donGia = 0; // Mặc định nếu < 0
        }
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        // Phải trước ngày hiện tại, mặc định là ngày hiện tại
        if (ngaySanXuat != null && ngaySanXuat.isBefore(LocalDate.now())) {
            this.ngaySanXuat = ngaySanXuat;
        } else {
            this.ngaySanXuat = LocalDate.now();
        }
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        // Phải sau ngày sản xuất, mặc định là ngày sản xuất
        if (ngayHetHan != null && ngayHetHan.isAfter(this.ngaySanXuat)) {
            this.ngayHetHan = ngayHetHan;
        } else {
            this.ngayHetHan = this.ngaySanXuat;
        }
    }

    // --- Câu b: Constructors ---

    // Constructor đầy đủ tham số
    public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) throws Exception {
        if (maHang == null || maHang.trim().isEmpty()) {
            throw new Exception("Lỗi: Mã hàng không được để rỗng!");
        }
        this.maHang = maHang;
        // Sử dụng lại các setter để kiểm tra ràng buộc dữ liệu
        this.setTenHang(tenHang);
        this.setDonGia(donGia);
        this.setNgaySanXuat(ngaySanXuat);
        this.setNgayHetHan(ngayHetHan);
    }

    // Constructor có tham số là mã hàng
    public HangThucPham(String maHang) throws Exception {
        if (maHang == null || maHang.trim().isEmpty()) {
            throw new Exception("Lỗi: Mã hàng không được để rỗng!");
        }
        this.maHang = maHang;
        this.tenHang = "xxx";
        this.donGia = 0;
        this.ngaySanXuat = LocalDate.now();
        this.ngayHetHan = this.ngaySanXuat;
    }

    // --- Câu c: Kiểm tra hàng thực phẩm đã hết hạn chưa ---
    public boolean isHetHan() {
        // Nếu ngày hiện tại sau ngày hết hạn thì trả về true
        return LocalDate.now().isAfter(this.ngayHetHan);
    }

    // --- Câu d: Phương thức toString ---
    @Override
    public String toString() {
        // Định dạng đơn giá: phân cách hàng nghìn
        DecimalFormat df = new DecimalFormat("#,###.00");
        // Định dạng ngày: dd/MM/yyyy
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        String ghiChu = isHetHan() ? "Hàng đã hết hạn" : "";
        
        return String.format("%-10s %-15s %-15s %-15s %-15s %s", 
                maHang, 
                tenHang, 
                df.format(donGia), 
                dtf.format(ngaySanXuat), 
                dtf.format(ngayHetHan), 
                ghiChu);
    }
}