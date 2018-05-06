package com.f22pkj31.crud.dao;

import com.f22pkj31.crud.bean.Teacher;
import com.f22pkj31.crud.bean.TeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    long countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);
}