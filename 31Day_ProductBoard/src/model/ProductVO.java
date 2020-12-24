package model;

public class ProductVO {

	private int pno;
	private String pname;
	private String pmaker;
	private String pprice;
	private String pdetail;
	
	public ProductVO(int pno, String pname, String pmaker, String pprice, String pdetail) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.pmaker = pmaker;
		this.pprice = pprice;
		this.pdetail = pdetail;
	}

	public ProductVO(int pno, String pname, String pmaker) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.pmaker = pmaker;
	}

	public ProductVO(String pname, String pmaker, String pprice, String pdetail) {
		super();
		this.pname = pname;
		this.pmaker = pmaker;
		this.pprice = pprice;
		this.pdetail = pdetail;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPmaker() {
		return pmaker;
	}

	public void setPmaker(String pmaker) {
		this.pmaker = pmaker;
	}

	public String getPprice() {
		return pprice;
	}

	public void setPprice(String pprice) {
		this.pprice = pprice;
	}

	public String getPdetail() {
		return pdetail;
	}

	public void setPdetail(String pdetail) {
		this.pdetail = pdetail;
	}

	@Override
	public String toString() {
		return "ProductVO [pno=" + pno + ", pname=" + pname + ", pmaker=" + pmaker + ", pprice=" + pprice + ", pdetail="
				+ pdetail + "]";
	}
}
