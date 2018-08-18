package com.springBoot.data.models;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("Levels")
public class Levels {
	
	@PrimaryKey("levelid")
	private long levelId;
	
	@Column(value="requestid")
	private long requestId;
	private int level;
	@Column(value="noofposition")
	private int noOfPosition;
	@Column(value="salarybracket")
	private int salaryBracket;
	private Skills skills;
	
	public Levels(){
		
	}

	public Levels(long levelId, long requestId, int level, int noOfPosition, int salaryBracket, Skills skills) {
		super();
		this.levelId = levelId;
		this.requestId = requestId;
		this.level = level;
		this.noOfPosition = noOfPosition;
		this.salaryBracket = salaryBracket;
		this.skills = skills;
	}

	public long getLevelId() {
		return levelId;
	}

	public void setLevelId(long levelId) {
		this.levelId = levelId;
	}

	public long getRequestId() {
		return requestId;
	}

	public void setRequestId(long requestId) {
		this.requestId = requestId;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getNoOfPosition() {
		return noOfPosition;
	}

	public void setNoOfPosition(int noOfPosition) {
		this.noOfPosition = noOfPosition;
	}

	public int getSalaryBracket() {
		return salaryBracket;
	}

	public void setSalaryBracket(int salaryBracket) {
		this.salaryBracket = salaryBracket;
	}

	public Skills getSkills() {
		return skills;
	}

	public void setSkills(Skills skills) {
		this.skills = skills;
	}
	
	
	
}
