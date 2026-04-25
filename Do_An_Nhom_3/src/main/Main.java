// ============================================================
// DU AN NHOM - BAI THUC HANH SO 3
// Mon hoc: Software Configuration Management
// Truong: Dai hoc Duy Tan
// Nhom: [Ten nhom]
// ============================================================

public class Main {
    public static void main(String[] args) {
        System.out.println("=== He thong Quan ly Sinh vien ===");
        System.out.println("Du an nhom - Bai thuc hanh SCM");
        System.out.println("");

        // Tao danh sach sinh vien mau
        SinhVien[] danhSach = {
            new SinhVien("Nguyen Van A", "SV001", "CNTT"),
            new SinhVien("Tran Thi B",   "SV002", "CNTT"),
            new SinhVien("Le Van C",      "SV003", "CNTT"),
        };

        System.out.println("--- Danh sach sinh vien ---");
        for (SinhVien sv : danhSach) {
            sv.hienThi();
        }

        System.out.println("");
        System.out.println("Tong so sinh vien: " + danhSach.length);
    }
}
