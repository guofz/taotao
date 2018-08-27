package com.study.mapper.test;

import com.study.pojo.test.PersonManagement;
import com.study.pojo.test.PersonManagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonManagementMapper {
/*    int countByExample(PersonManagementExample example);

    int deleteByExample(PersonManagementExample example);

    int deleteByPrimaryKey(Long pmId);

    int insert(PersonManagement record);

    int insertSelective(PersonManagement record);

    PersonManagement selectByPrimaryKey(Long pmId);

    int updateByExampleSelective(@Param("record") PersonManagement record, @Param("example") PersonManagementExample example);

    int updateByExample(@Param("record") PersonManagement record, @Param("example") PersonManagementExample example);

    int updateByPrimaryKeySelective(PersonManagement record);

    int updateByPrimaryKey(PersonManagement record);
*/
	
    List<PersonManagement> selectByExample(PersonManagementExample example);
	List<PersonManagement> list();
}