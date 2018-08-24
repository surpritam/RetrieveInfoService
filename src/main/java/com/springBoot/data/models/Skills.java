package com.springBoot.data.models;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@UserDefinedType(value="Skills")
public class Skills {
	
	private String required;
	@Column(value="goodtohave")
	private String goodToHave;
	@Column(value="jobdesc")
	private String jobDesc;
	
	public Skills(){
		
	}
	
	public Skills(String required, String goodToHave, String jobDesc) {
		super();
		this.required = required;
		this.goodToHave = goodToHave;
		this.jobDesc = jobDesc;
	}

	public String getRequired() {
		return required;
	}

	public void setRequired(String required) {
		this.required = required;
	}

	public String getGoodToHave() {
		return goodToHave;
	}

	public void setGoodToHave(String goodToHave) {
		this.goodToHave = goodToHave;
	}

	public String getJobDesc() {
		return jobDesc;
	}

	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

}
