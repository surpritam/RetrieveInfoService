package com.springBoot.data.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.data.models.InterviewInfo;
import com.springBoot.data.service.InfoService;

@RestController
@RequestMapping("/api")
public class InfoController {

	@Autowired
	private InfoService infoService;
	
	
	@GetMapping("/retrieveInfo")
	public List<InterviewInfo> getAllInterviewInfos(){
		
		return infoService.getAllInterviewInfo();
		
	}
	/*
	@RequestMapping("/retrieveInfo/{id}")
	public InterviewInfo getInfo(@PathVariable("id") String id){
		return null;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/createInterviewInfo")
	public void addInterviewInfo(@RequestBody InterviewInfo info){
		infoService.addInterviewInfo(info);
	}
	*/
}
