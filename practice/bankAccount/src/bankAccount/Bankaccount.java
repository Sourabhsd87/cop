package bankAccount;

public class Bankaccount {
	private int actid;
	private String name;
	private String email;
	private double balance;
	private accountType actType;
	
	private Date doc;

	public Bankaccount(int actid, String name, String email, double balance, accountType actType, Date doc) {
		super();
		this.actid = actid;
		this.name = name;
		this.email = email;
		this.balance = balance;
		this.actType = actType;
		this.doc = doc;
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

	public accountType getActType() {
		return actType;
	}

	public void setActType(accountType actType) {
		this.actType = actType;
	}

	public Date getDoc() {
		return doc;
	}

	public void setDoc(Date doc) {
		this.doc = doc;
	}

	public int getActid() {
		return actid;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Bankaccount [actid=" + actid + ", name=" + name + ", email=" + email + ", balance=" + balance
				+ ", actType=" + actType + "," + doc + "]";
	}
	
	
	
}
