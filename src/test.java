
public class test {
	public static void main(String[] args) {
		HoaDonCaPhe hd = new HoaDonCaPhe("aaa", 100000, 5.5);
		HoaDonCaPhe hd1 = new HoaDonCaPhe("aa", 100000, 1.5);
		int tongTien = (int) hd.tinhTongTien();
		// System.out.println("tong tien :" + tongTien);

		System.out.println("Kiem tra khoi luong > 1 :" + hd.kiemTraKhoiLuong(1));
		System.out.println("Hoa don lon hon 500k :" + hd.kiemTraHoaDon());
		System.out.println("Giam gia cua hd :" + hd.giamGia(10));
		System.out.println("Giam gia cua hd1 :" + hd1.giamGia(10));
		System.out.println("hoa don :"+hd.hoaDon(10));
		System.out.println("hoa don 1:"+hd1.hoaDon(10));


	}
}
