package com.springBoot.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.data.models.InterviewInfo;
import com.springBoot.data.models.Levels;
import com.springBoot.data.repos.InterviewInfoRepository;
import com.springBoot.data.repos.LevelsRepository;

@Service
public class InfoService {
	
	@Autowired
	private InterviewInfoRepository interviewInfoRepository;
	
	@Autowired
	private LevelsRepository levelsRepository;
	
	public List<InterviewInfo> getAllInterviewInfo(){
		List<InterviewInfo> infos = interviewInfoRepository.getAllInfo();
		for (InterviewInfo info:infos){
			List<Levels> levels = levelsRepository.getLevelsByReqId(info.getRequestId());
			info.setLevels(levels);
		}
		
		return infos;
	}
}
