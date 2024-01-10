
public class HoaDonCaPhe {
	private String tenCaPhe;
	private double giaTien1Kg;
	private double khoiLuong;

	public HoaDonCaPhe(String tenCaPhe, double giaTien1Kg, double khoiLuong) {
		this.tenCaPhe = tenCaPhe;
		this.giaTien1Kg = giaTien1Kg;
		this.khoiLuong = khoiLuong;
	}

	public double tinhTongTien() {
		return giaTien1Kg * khoiLuong;
	}

	public boolean kiemTraKhoiLuong(double kl) {
		return khoiLuong > kl;

	}

	public boolean kiemTraHoaDon() {
		return tinhTongTien() > 500000;
	}

	public double giamGia(double x) {
		if (tinhTongTien() > 500000) {
			return (x / 100) * tinhTongTien();
		} else
			return 0;

	}
	public double hoaDon (double x) {
	 return tinhTongTien()- giamGia(x);
	 }

}
