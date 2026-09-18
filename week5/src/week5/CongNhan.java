package week5;

public class CongNhan {
	private int mCN;
	private String mHo;
	private String mTen;
	private int mSoSP;
	
	//Get_Set
	public int getMaCN() {
		return mCN;
	}
	public void setMaCN(int mCN) {
		this.mCN = mCN;
	}
	
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String mHo) {
		this.mHo = mHo;
	}
	
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) {
		this.mTen = mTen;
	}
	
	public int getmSoSP() {
		return mSoSP;
	}
	public void setmSoSP(int mSoSP) {
		if(mSoSP > 0){
			this.mSoSP = mSoSP;
		}
	}
	
	
	public CongNhan (int mCN, String mHo, String mTen, int mSoSP){
		this.mCN = mCN;
		this.mHo = mHo;
		this.mTen = mTen;
		this.mSoSP = mSoSP;
	}
	
	public Double tinhLuong() {
		
		if(mSoSP < 200) {
			return mSoSP * 0.5;
		}
		
		else if(mSoSP < 400) {
			return (mSoSP - 199) * 0.55 + 199 * 0.5; 
		}
		
		else if(mSoSP < 600) {
			return (mSoSP - 399) * 0.6 + 199 * 0.55 + 199 * 0.5;
		}
		
		else {
			return (mSoSP - 599) * 0.65 + 199 * 0.6  + 199 * 0.55 + 199 * 0.5;
		}
	}
	
	@Override
	public String toString() {
		return String.format("%-8d |%-10s |%-10s |%d ",
				      mCN, mHo, mTen, mSoSP);
	}
}
