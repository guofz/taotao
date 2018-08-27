package com.study.service.impl.test;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.study.mapper.test.ApprovalOrganizationMapper;
import com.study.mapper.test.PersonManagementMapper;
import com.study.pojo.test.ApprovalOrganization;
import com.study.pojo.test.PersonManagement;
import com.study.pojo.test.PersonManagementExample;
import com.study.service.test.PersonManagementService;

@org.springframework.stereotype.Service
public class PersonManagementServiceImpl implements PersonManagementService {

	@Autowired
	private PersonManagementMapper personManagementMapper;
	
	@Autowired
	private ApprovalOrganizationMapper approvalOrganizationMapper;

	@Override
	@Transactional
	public List<PersonManagement> list() {
		System.out.println("执行开始： -------------------- " + new SimpleDateFormat("yyyy-MM-ss HH:mm:ss.SSS").format(new Date()));
		int id = 1; //自增长主键
		int record = 1;
		List<PersonManagement> list = personManagementMapper.list();
		for (PersonManagement pm : list) {
			System.out.println(record);
			record++;
			ApprovalOrganization ao = new ApprovalOrganization();
//			拼接名称
			String pam = pm.getPmApprovalMechanism();
			String[] pams = pam == null ? null : pam.split(",");
			
//			拼接code
			StringBuffer pamcBuffer = new StringBuffer(pm.getPmApprovalMechanismCode() == null ? "" : pm.getPmApprovalMechanismCode());
			pamcBuffer.append(pm.getAttribute1() == null ? "" : pm.getAttribute1());
			pamcBuffer.append(pm.getAttribute2() == null ? "" : pm.getAttribute2());
			pamcBuffer.append(pm.getAttribute3() == null ? "" : pm.getAttribute3());
			pamcBuffer.append(pm.getAttribute4() == null ? "" : pm.getAttribute4());
			pamcBuffer.append(pm.getAttribute5() == null ? "" : pm.getAttribute5());
			String pamc = pamcBuffer.toString();
			String[] pamcs = pamc == null ? null : pamc.split(",");
			
			ao.setAoPmId(pm.getPmId().toString());
			if (pams != null && pams.length > 0 && pamcs.length > 0 && pams.length == pamcs.length) {
				for (int i = 0; i < pamcs.length; i++) {
//					循环 名称、编码
					ao.setAoApprovalMechanism(pams[i]);
					ao.setAoApprovalMechanismCode(pamcs[i]);
//					自增上主键
					ao.setAoid(String.valueOf(id));
					try {
						approvalOrganizationMapper.insert(ao);
					} catch (Exception e) {
						e.printStackTrace();
					}
					id++;
				}
			} 
//			else if (pams == null) {
//				ao.setAoid(String.valueOf(id));
//				approvalOrganizationMapper.insert(ao);
//				id++;
//			}
		}
		
		System.out.println("执行完成： =================== " + new SimpleDateFormat("yyyy-MM-ss HH:mm:ss.SSS").format(new Date()));
		return null;
	}

	@Override
	public void changeData() {
		
	}

	@Override
	public List<PersonManagement> selectByExample(PersonManagementExample example) {
		return personManagementMapper.selectByExample(null);
	}

	

	
}
