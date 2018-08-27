package com.study.service.test;

import java.util.List;

import com.study.pojo.test.PersonManagement;
import com.study.pojo.test.PersonManagementExample;

public interface PersonManagementService {

	List<PersonManagement> selectByExample(PersonManagementExample example);
	
	List<PersonManagement> list();

	void changeData();
	
}
