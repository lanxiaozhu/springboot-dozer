package com.example.demo.dozer.domain;

import java.util.Date;

/**
 * @Auther: wishm
 * @Date: 2019/6/18 23:48
 * @Description:
 */
public class BaseEntity {

    /**
     * 主键
     */
    private String id;

    /**
     * 创建时间
     */
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
