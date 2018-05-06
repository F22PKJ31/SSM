package com.f22pkj31.crud.dao;

import com.f22pkj31.crud.bean.Sc;
import com.f22pkj31.crud.bean.ScExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScMapper {
    long countByExample(ScExample example);

    int deleteByExample(ScExample example);

    int insert(Sc record);

    int insertSelective(Sc record);

    List<Sc> selectByExample(ScExample example);

    int updateByExampleSelective(@Param("record") Sc record, @Param("example") ScExample example);

    int updateByExample(@Param("record") Sc record, @Param("example") ScExample example);
}