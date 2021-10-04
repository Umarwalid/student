package com.studentregister.demo.dao;
//import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.studentregister.demo.model.StudentRecord;


@RepositoryRestResource(collectionResourceRel ="std",path = "std") 
public interface Studentdrepo extends JpaRepository<StudentRecord,Integer> {
	
	List<StudentRecord> findByFirstname(String Firstname);
	List<StudentRecord> findByLastname(String Lastname);
	List<StudentRecord> findByOthername(String Othername);
	List<StudentRecord> findByGender(String Gender);
	List<StudentRecord> findByDepartment(String Department );
	List<StudentRecord> findByCreator(String creator);
//	List<std> findAllStartLessThanEqualAndEndGreaterThanEqual(OffsetDateTime end, OffsetDateTime start);
	
	
}
