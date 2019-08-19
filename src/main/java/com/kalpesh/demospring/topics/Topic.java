package com.kalpesh.demospring.topics;

public class Topic {
	private String id;
	private String name;
	private String descraption;

	public Topic() {
	}

	public Topic(String id, String name, String descraption) {
		super();
		this.id = id;
		this.name = name;
		this.descraption = descraption;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescraption() {
		return descraption;
	}

	public void setDescraption(String descraption) {
		this.descraption = descraption;
	}

}
