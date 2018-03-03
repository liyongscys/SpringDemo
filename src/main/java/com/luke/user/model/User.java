package com.luke.user.model;

/**
 * 用户实体
 */
public class User {
    /**
     * ID
     */
    private String id;
    /**
     * 名称
     */
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
