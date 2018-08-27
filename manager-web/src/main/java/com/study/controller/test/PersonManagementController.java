package com.study.controller.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.pojo.test.PersonManagement;
import com.study.service.test.PersonManagementService;

@Controller
@RequestMapping("/personManagement")
public class PersonManagementController {

	@Autowired
	PersonManagementService personManagementService;
	
	@RequestMapping("/list")
	@ResponseBody
	private List<PersonManagement> list() {
		return personManagementService.list();
	}
	
	@RequestMapping("/listAll")
	@ResponseBody
	private List<PersonManagement> listAll() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println(sdf.format(new Date()));
		List<PersonManagement> list = personManagementService.selectByExample(null);
		System.out.println(sdf.format(new Date()));
		return list;
	}
	
	
}
