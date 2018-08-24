package com.springBoot.data.models;

import java.util.List;

import org.springframework.data.annotation.Transient;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.hateoas.Link;


@Table("InterviewInfo")
public class InterviewInfo{
	@PrimaryKey("requestid")
	private long requestId;
	@Column(value = "totalnoofposition")
	private int totalNoOfPosition;
	private String location;
	private String client;
	private String skillset;
	@Column(value = "projectname")
	private String projectName;
	
	private List<Levels> levels;
	@Transient
	private Link link;
	
	public InterviewInfo(){
		
	}

	public InterviewInfo(long requestId, int totalNoOfPosition, String location, String client, String skillset,
			String projectName, List<Levels> levels, Link link) {
		super();
		this.requestId = requestId;
		this.totalNoOfPosition = totalNoOfPosition;
		this.location = location;
		this.client = client;
		this.skillset = skillset;
		this.projectName = projectName;
		this.levels = levels;
		this.link = link;
	}

	public long getRequestId() {
		return requestId;
	}

	public void setRequestId(long requestId) {
		this.requestId = requestId;
	}

	public int getTotalNoOfPosition() {
		return totalNoOfPosition;
	}

	public void setTotalNoOfPosition(int totalNoOfPosition) {
		this.totalNoOfPosition = totalNoOfPosition;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getSkillset() {
		return skillset;
	}

	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Levels> getLevels() {
		return levels;
	}

	public void setLevels(List<Levels> levels) {
		this.levels = levels;
	}


	public Link getLink() {
		return link;
	}


	public void setLink(Link link) {
		this.link = link;
	}

	
}
