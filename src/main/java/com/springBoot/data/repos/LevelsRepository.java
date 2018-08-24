package com.springBoot.data.repos;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import com.springBoot.data.models.Levels;

public interface LevelsRepository extends CassandraRepository<Levels, Long> {
	//no longer needed
	@Query(value = "Select * from Levels where requestid=?0 ALLOW FILTERING")
	public List<Levels> getLevelsByReqId(long requestid);

}
