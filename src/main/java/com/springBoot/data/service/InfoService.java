package com.springBoot.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.data.models.InterviewInfo;
import com.springBoot.data.repos.InterviewInfoRepository;

@Service
public class InfoService {
	
	@Autowired
	private InterviewInfoRepository interviewInfoRepository;

	
	public List<InterviewInfo> getAllInterviewInfo(){
		return interviewInfoRepository.getAllInfo();
		
	}
	
	public InterviewInfo getInfoById(long requestId){
		InterviewInfo info = interviewInfoRepository.getInfoById(requestId);
		return info;
		
	}
	
	public void addInterviewInfo(InterviewInfo info){
		interviewInfoRepository.save(info);
		
	}
}
