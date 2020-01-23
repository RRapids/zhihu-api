package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.entity.Columns;
import com.scs.soft.zhihu.api.mapper.ColumnsMapper;
import com.scs.soft.zhihu.api.service.ColumnsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/1/22
 */
@Service
public class ColumnsServiceImpl implements ColumnsService {
@Resource
private ColumnsMapper columnsMapper;
    @Override
    public List<Columns> selectAll() {
        return columnsMapper.selectAll();
    }

    @Override
    public List<Columns> selectRecent() {
        return columnsMapper.selectRecent();
    }
}
