package com.springBoot.data.repositories;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import com.springBoot.data.models.InterviewInfo;

public interface InterviewInfoRepository extends CassandraRepository<InterviewInfo, Long> {
	
	@Query(value = "Select * from InterviewInfo")
	public List<InterviewInfo> getAllInfo();
	

}
