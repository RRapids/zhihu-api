package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.RoundTable;
import com.scs.soft.zhihu.api.entity.Special;

import java.util.List;
import java.util.Map;

public interface RoundTableService {
    /**
     * 查询所有圆桌
     */
    List<RoundTable> selectAll();
    /**
     * 查询最近圆桌
     */
    List<RoundTable> selectRecent();
}
