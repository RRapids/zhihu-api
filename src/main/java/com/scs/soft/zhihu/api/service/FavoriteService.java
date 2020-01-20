package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Favorite;
import com.scs.soft.zhihu.api.entity.RoundTable;

import java.util.List;

public interface FavoriteService {
    /**
     * 查询所有收藏
     */
    List<Favorite> selectAll();
    /**
     * 查询四个收藏
     */
    List<Favorite> selectRecent();
}
