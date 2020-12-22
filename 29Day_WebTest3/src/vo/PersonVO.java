package vo;

public class PersonVO {

	private String id;
	private String nick;
	
	public PersonVO(String id, String nick) {
		super();
		this.id = id;
		this.nick = nick;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	@Override
	public String toString() {
		return "PersonVO [id=" + id + ", nick=" + nick + "]";
	}
}
