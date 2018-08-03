package com.springBoot.data.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.data.models.InterviewInfo;
import com.springBoot.data.service.InfoService;

@RestController
public class InfoController {

	@Autowired
	private InfoService infoService;
	
	
	@RequestMapping("/retrieveInfo")
	public List<InterviewInfo> getAllInterviewInfo(){
		List<InterviewInfo> infos=infoService.getAllInterviewInfo();
		for (InterviewInfo info:infos){
			Link link = ControllerLinkBuilder.linkTo(InfoController.class).slash("/retrieveInfo").slash(info.getRequestId()).withSelfRel();
			
			info.add(link);
		}
		return infos;
		
	}
	
	@RequestMapping("/retrieveInfo/{id}")
	public InterviewInfo getInfo(@PathVariable("id") String id){
		return infoService.getInterviewInfo(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/createInterviewInfo")
	public void addInterviewInfo(@RequestBody InterviewInfo info){
		infoService.addInterviewInfo(info);
	}
	
}
