package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.Columns;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = ZhihuApiApplication.class)
class ColumnsMapperTest {
    @Resource
    private ColumnsMapper columnsMapper;

    @Test
    void selectRecent() {
        List<Columns> columns = columnsMapper.selectRecent();
        columns.forEach(System.out::println);
    }

    @Test
    void selectAll() {
        List<Columns> columns = columnsMapper.selectAll();
        columns.forEach(System.out::println);
    }
}