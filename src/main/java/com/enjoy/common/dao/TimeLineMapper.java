package com.enjoy.common.dao;

import com.enjoy.common.entity.TimeLine;
import com.enjoy.common.entity.TimeLineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeLineMapper {
    long countByExample(TimeLineExample example);

    int deleteByExample(TimeLineExample example);

    int deleteByPrimaryKey(String id);

    int insert(TimeLine record);

    int insertSelective(TimeLine record);

    List<TimeLine> selectByExample(TimeLineExample example);

    TimeLine selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TimeLine record, @Param("example") TimeLineExample example);

    int updateByExample(@Param("record") TimeLine record, @Param("example") TimeLineExample example);

    int updateByPrimaryKeySelective(TimeLine record);

    int updateByPrimaryKey(TimeLine record);
}