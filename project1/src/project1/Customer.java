package project1;

public class Customer {
	private String cname;
	private String loc;
	private long cno;
	private String order;
	private int pawd;
	private String rest;
	
 Customer(String cname, String loc, long cno,String order, int pawd,String rest) {
		
		this.cname = cname;
		this.loc = loc;
		this.cno = cno;
		this.order = order;
		this.pawd = pawd;
		this.rest =rest;
	}
 
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public long getCno() {
		return cno;
	}
	public void setCno(long cno) {
		this.cno = cno;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public int getPawd() {
		return pawd;
	}
	public void setPawd(int pawd) {
		this.pawd = pawd;
	}

	public String getRest() {
		return rest;
	}

	public void setRest(String rest) {
		this.rest = rest;
	}

}
