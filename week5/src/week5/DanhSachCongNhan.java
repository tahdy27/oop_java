package week5;

public class DanhSachCongNhan {
	private CongNhan[] DS;
	private int count;
	
	
	public DanhSachCongNhan (int n) {
		DS = new CongNhan[n];
		count = 0;
	}
	
	public boolean addCN (CongNhan a) {
		if (count < DS.length) {
			DS[count] = a;
			count ++;
			return true;
		}
		
		return false;
	}
	
	public void xuatdsCN () {
		System.out.printf("%-8s |%-10s |%-10s |%s\n",
				 "Ma", "Ho", "Ten", "So san pham");
		for (int i = 0; i < count; i++) {
			System.out.println(DS[i]);
		}
	}
	
	public int SoLuongCN () {
		return this.count;
	}
	
	public void xuatCN () {
		for (int i = 0; i < count; i++) {
			if (DS[i].getmSoSP() > 200) {
				System.out.println(DS[i]);
			}
		}
	}
	
	public void SapXepGiamDan() {
	    for (int i = 0; i < count - 1; i++) {
	        for (int j = i + 1; j < count; j++) {
	            if (DS[i].getmSoSP() < DS[j].getmSoSP()) {
	                CongNhan temp = DS[i];
	                DS[i] = DS[j];
	                DS[j] = temp;
	            }
	        }
	    }
	}
}
