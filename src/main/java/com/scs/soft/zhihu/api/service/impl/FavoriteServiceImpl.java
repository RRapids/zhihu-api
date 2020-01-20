package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.entity.Favorite;
import com.scs.soft.zhihu.api.mapper.FavoriteMapper;
import com.scs.soft.zhihu.api.service.FavoriteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/1/20
 */
@Service
public class FavoriteServiceImpl implements FavoriteService {
    @Resource
    private FavoriteMapper favoriteMapper;
    @Override
    public List<Favorite> selectAll() {
        return favoriteMapper.selectAll();
    }

    @Override
    public List<Favorite> selectRecent() {
        return favoriteMapper.selectRecent();
    }
}
