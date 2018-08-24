package com.springBoot.data.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.data.models.InterviewInfo;
import com.springBoot.data.service.InfoService;

@RestController
public class InfoController {

	@Autowired
	private InfoService infoService;
	
	
	@GetMapping("/retrieveInfo")
	public List<InterviewInfo> getAllInterviewInfos(){
		
		List<InterviewInfo> infos=infoService.getAllInterviewInfo();
		for (InterviewInfo info:infos){
			Link link = ControllerLinkBuilder.linkTo(InfoController.class).slash("/retrieveInfo").slash(info.getRequestId()).withSelfRel();
			info.setLink(link);
			
		}
		return infos;
		
	}
	
	@GetMapping("/retrieveInfo/{id}")
	public InterviewInfo getInfo(@PathVariable("id") Long requestId){
		return infoService.getInfoById(requestId);
	}
	
	@PostMapping("/createInterviewInfo")
	public void createInterviewInfo(@RequestBody InterviewInfo info){
		infoService.addInterviewInfo(info);
	}

}
