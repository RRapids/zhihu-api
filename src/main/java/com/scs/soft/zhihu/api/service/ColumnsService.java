package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Columns;

import java.util.List;

public interface ColumnsService {
    //查询所有专栏
    List<Columns> selectAll();
    //查询四个专栏
    List<Columns> selectRecent();
}
