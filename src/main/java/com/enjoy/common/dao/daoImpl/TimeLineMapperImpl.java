package com.enjoy.common.dao.daoImpl;/**
 * TODO
 *
 * @author 谢树树
 * @date 30/7/2022 下午2:01
 */

import com.enjoy.common.dao.TimeLineMapper;
import com.enjoy.common.entity.TimeLine;
import com.enjoy.common.entity.TimeLineExample;

import java.util.List;

/**
 * TODO
 *
 *30/7/2022 下午2:01
 */
public class TimeLineMapperImpl implements TimeLineMapper {
    @Override
    public long countByExample(TimeLineExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(TimeLineExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(TimeLine record) {
        return 0;
    }

    @Override
    public int insertSelective(TimeLine record) {
        return 0;
    }

    @Override
    public List<TimeLine> selectByExample(TimeLineExample example) {
        return null;
    }

    @Override
    public TimeLine selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(TimeLine record, TimeLineExample example) {
        return 0;
    }

    @Override
    public int updateByExample(TimeLine record, TimeLineExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(TimeLine record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TimeLine record) {
        return 0;
    }
}
