package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.Favorite;
import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = ZhihuApiApplication.class)
class FavoriteMapperTest {
@Resource
private FavoriteMapper favoriteMapper;
    @Test
    void selectRecent() {
    List<Favorite> favorites = favoriteMapper.selectRecent();
    favorites.forEach(System.out::println);
    }

    @Test
    void selectAll() {
        List<Favorite> favorites = favoriteMapper.selectAll();
        favorites.forEach(System.out::println);
    }
}