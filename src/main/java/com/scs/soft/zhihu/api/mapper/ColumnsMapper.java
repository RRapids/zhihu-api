package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Columns;
import com.scs.soft.zhihu.api.entity.Favorite;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ColumnsMapper {
    @Select("SELECT * FROM t_columns ORDER BY RAND(id) LIMIT 4 ")
    List<Columns> selectRecent();
    @Select("SELECT * FROM t_columns ")
    List<Columns> selectAll();
}
