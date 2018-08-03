package com.springBoot.data.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springBoot.data.models.InterviewInfo;
import com.springBoot.data.models.Levels;
import com.springBoot.data.models.Skills;

@Service
public class InfoService {
	
	private List<InterviewInfo> info = new ArrayList<InterviewInfo>(Arrays.asList(
			new InterviewInfo("1", 2, "Delaware", "ABC", "Machine learning", "Digital", new ArrayList<>(Arrays.asList(
					new Levels(4, 1,10000,
							new Skills("Python", "Statistics", "Data scientist")),
							new Levels(5,1,15000,new Skills("Pega","Java","Architect")))))
			));

	public List<InterviewInfo> getAllInterviewInfo(){
		return info;
	}
	
	public InterviewInfo getInterviewInfo(String id){
		return info.stream().filter(t -> t.getRequestId().equals(id)).findFirst().get();
		
	}
	
	public void addInterviewInfo(InterviewInfo addInfo){
		info.add(addInfo);
	}
}
