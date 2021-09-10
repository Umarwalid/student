package com.stdapp.demo.dao;
import com.stdapp.demo.model.std;


//import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel ="std",path = "std") 
public interface stdrepo extends JpaRepository<std,Integer> {
	
	List<std> findByFirstname(String Firstname);
	List<std> findByLastname(String Lastname);
	List<std> findByOthername(String Othername);
	List<std> findByGender(String Gender);
	List<std> findByDepartment(String Department );
	List<std> findByCreator(String creator);
//	List<std> findAllStartLessThanEqualAndEndGreaterThanEqual(OffsetDateTime end, OffsetDateTime start);
	
	
}
