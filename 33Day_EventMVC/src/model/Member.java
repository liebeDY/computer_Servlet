package model;

public class Member {
	
	private int num;
	private String id;
	private String email;
	private String pwd;
	
	public Member(String id, String email, String pwd) {
		super();
		this.id = id;
		this.email = email;
		this.pwd = pwd;
	}

	public Member(int num, String id, String email, String pwd) {
		super();
		this.num = num;
		this.id = id;
		this.email = email;
		this.pwd = pwd;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "Member [num=" + num + ", id=" + id + ", email=" + email + ", pwd=" + pwd + "]";
	}
}
