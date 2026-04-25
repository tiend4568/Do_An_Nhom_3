// ============================================================
// Lop SinhVien - Luu thong tin sinh vien
// ============================================================

public class SinhVien {
    private String hoTen;
    private String maSV;
    private String khoa;

    // Constructor
    public SinhVien(String hoTen, String maSV, String khoa) {
        this.hoTen = hoTen;
        this.maSV  = maSV;
        this.khoa  = khoa;
    }

    // Hien thi thong tin
    public void hienThi() {
        System.out.println("  [" + maSV + "] " + hoTen + " - Khoa: " + khoa);
    }

    // Getter
    public String getHoTen() { return hoTen; }
    public String getMaSV()  { return maSV; }
    public String getKhoa()  { return khoa; }

    // Setter
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }
    public void setMaSV(String maSV)   { this.maSV = maSV; }
    public void setKhoa(String khoa)   { this.khoa = khoa; }
}
