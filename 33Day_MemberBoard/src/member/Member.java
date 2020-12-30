package member;

public class Member {
	private String id;
	private String pwd;
	private String name;
	private String email;
	
	public Member() {
		
	}
	public Member(String id, String pwd, String name, String email) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
	}
	
	@Override
	public boolean equals(Object obj) {
		// obj 가 아니고 Member 타입일 때
		if (obj != null && obj instanceof Member) {
			Member m = (Member) obj;
			
			if (this.id.equals(m.getId())) {
				return true;
			}
		}
		return false;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + "]";
	}
}
