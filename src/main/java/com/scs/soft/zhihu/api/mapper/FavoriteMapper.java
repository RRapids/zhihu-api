package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Favorite;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FavoriteMapper {
@Select("SELECT * FROM t_favorite ORDER BY RAND(id) LIMIT 4 ")
    List<Favorite> selectRecent();
@Select("SELECT * FROM t_favorite")
    List<Favorite> selectAll();
}
