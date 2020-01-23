package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/1/20
 */
@Data
@Builder
public class Columns {
    private Integer id;
    private String title;
    private String description;
    private String url;
    private String imageUrl;
    private Integer follower;
    private Integer articlesCount;
}
