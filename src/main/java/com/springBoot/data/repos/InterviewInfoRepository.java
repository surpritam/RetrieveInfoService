package com.springBoot.data.repos;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import com.springBoot.data.models.InterviewInfo;

public interface InterviewInfoRepository extends CassandraRepository<InterviewInfo, Long> {
	
	@Query(value = "Select * from InterviewInfo")
	public List<InterviewInfo> getAllInfo();
	
	@Query(value = "Select * from InterviewInfo where requestid=?0 ALLOW FILTERING")
	public InterviewInfo getInfoById(long requestId);
	
	

}
