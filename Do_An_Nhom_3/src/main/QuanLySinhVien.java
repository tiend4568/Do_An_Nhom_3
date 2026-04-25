// ============================================================
// Lop QuanLySinhVien - Xu ly cac thao tac quan ly
// ============================================================

import java.util.ArrayList;

public class QuanLySinhVien {
    private ArrayList<SinhVien> danhSach;

    public QuanLySinhVien() {
        this.danhSach = new ArrayList<>();
    }

    // Them sinh vien
    public void themSinhVien(SinhVien sv) {
        danhSach.add(sv);
        System.out.println("Da them: " + sv.getHoTen());
    }

    // Tim kiem theo ma SV
    public SinhVien timKiem(String maSV) {
        for (SinhVien sv : danhSach) {
            if (sv.getMaSV().equals(maSV)) {
                return sv;
            }
        }
        return null;
    }

    // In toan bo danh sach
    public void inDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach trong!");
            return;
        }
        System.out.println("--- Danh sach (" + danhSach.size() + " sinh vien) ---");
        for (SinhVien sv : danhSach) {
            sv.hienThi();
        }
    }

    public int getSoLuong() {
        return danhSach.size();
    }
}
