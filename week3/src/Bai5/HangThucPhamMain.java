package Bai5;

import java.time.LocalDate;

public class HangThucPhamMain {
    public static void main(String[] args) {
        try {
            // Tiêu đề
            System.out.println(String.format("%-10s %-15s %-15s %-15s %-15s %s", 
                "Mã Hàng", "Tên Hàng", "Đơn Giá", "Ngày SX", "Ngày HH", "Ghi chú"));
            System.out.println("-------------------------------------------------------------------------------------------");

            // Câu e: Tạo 3 đối tượng
            
            // 1. Đối tượng hợp lệ
            HangThucPham h1 = new HangThucPham("001", "Sữa tươi", 15000, 
                    LocalDate.of(2023, 5, 10), LocalDate.of(2025, 12, 31));

            // 2. Đối tượng có ngày hết hạn trước ngày sản xuất (Sẽ bị gán mặc định là Ngày SX)
            HangThucPham h2 = new HangThucPham("002", "Bánh mì", 5000, 
                    LocalDate.of(2024, 1, 1), LocalDate.of(2023, 1, 1));

            // 3. Đối tượng đã hết hạn so với ngày hiện tại
            HangThucPham h3 = new HangThucPham("003", "Mì tôm", 3500, 
                    LocalDate.of(2022, 1, 1), LocalDate.of(2023, 1, 1));

            // Xuất thông tin
            System.out.println(h1);
            System.out.println(h2);
            System.out.println(h3);

            // Câu f: Kiểm thử ràng buộc (Mã hàng rỗng)
            System.out.println("\n--- Thử nghiệm tạo mã hàng rỗng ---");
            HangThucPham h4 = new HangThucPham(""); 

        } catch (Exception e) {
            // In lỗi nếu mã hàng rỗng
            System.out.println(e.getMessage());
        }
    }
}