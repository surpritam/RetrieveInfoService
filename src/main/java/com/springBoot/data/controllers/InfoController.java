package com.springBoot.data.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.data.models.InterviewInfo;
import com.springBoot.data.service.InfoService;

@RestController
public class InfoController {

	@Autowired
	private InfoService infoService;
	
	
	@GetMapping("/retrieveInfo")
	public List<InterviewInfo> getAllInterviewInfos(){
		
		return infoService.getAllInterviewInfo();
		
	}
	
	@GetMapping("/retrieveInfo/{id}")
	public InterviewInfo getInfo(@PathVariable("id") Long requestId){
		return infoService.getInfoById(requestId);
	}
	/*
	@RequestMapping(method=RequestMethod.POST,value="/createInterviewInfo")
	public void addInterviewInfo(@RequestBody InterviewInfo info){
		infoService.addInterviewInfo(info);
	}
	*/
}
