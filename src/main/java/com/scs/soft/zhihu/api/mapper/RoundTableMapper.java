package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.RoundTable;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import javax.annotation.Resource;
import java.util.List;

public interface RoundTableMapper {
    /**
     * 查询最新圆桌
     */
    @Select("SELECT * FROM t_round_table ORDER BY RAND(id) LIMIT 4 ")
    List<RoundTable> selectRecent();

    /**
     * 查询所有圆桌
     */
    @Select("SELECT * FROM t_round_table ")
    List<RoundTable> selectAll();
}
