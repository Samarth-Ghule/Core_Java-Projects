package com.IPL;

public class Player {

	private int id;
	private int jno;
	private String name;
	private String cname;
	private String skill;

	public Player(int id, int jno, String name, String cname, String skill) {
		super();
		this.id = id;
		this.jno = jno;
		this.name = name;
		this.cname = cname;
		this.skill = skill;
	}

	public Player() {

	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", jno=" + jno + ", name=" + name + ", cname=" + cname + ", skill=" + skill + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getJno() {
		return jno;
	}

	public void setJno(int jno) {
		this.jno = jno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

}
