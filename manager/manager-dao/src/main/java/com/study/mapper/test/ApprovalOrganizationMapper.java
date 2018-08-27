package com.study.mapper.test;

import com.study.pojo.test.ApprovalOrganization;
import com.study.pojo.test.ApprovalOrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApprovalOrganizationMapper {

	int insert(ApprovalOrganization record);
	void testInsert(ApprovalOrganization record);
    /*int countByExample(ApprovalOrganizationExample example);

    int deleteByExample(ApprovalOrganizationExample example);

    int deleteByPrimaryKey(String aoid);

    int insert(ApprovalOrganization record);

    int insertSelective(ApprovalOrganization record);

    List<ApprovalOrganization> selectByExample(ApprovalOrganizationExample example);

    ApprovalOrganization selectByPrimaryKey(String aoid);

    int updateByExampleSelective(@Param("record") ApprovalOrganization record, @Param("example") ApprovalOrganizationExample example);

    int updateByExample(@Param("record") ApprovalOrganization record, @Param("example") ApprovalOrganizationExample example);

    int updateByPrimaryKeySelective(ApprovalOrganization record);

    int updateByPrimaryKey(ApprovalOrganization record);*/
}