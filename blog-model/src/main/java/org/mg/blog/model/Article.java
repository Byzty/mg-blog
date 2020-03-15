package org.mg.blog.model;

import lombok.Data;

import java.util.Date;

@Data
public class Article {
    private String id;
    private String title;
    private Date createTime;
    private Date updateTime;
    private String content;
    private Integer viewCount;
    private Integer pointCount;
}
