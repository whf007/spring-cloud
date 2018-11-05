package com.xue.springservice.dao.model;

/**
 * Created by Administrator on 2018/11/5.
 */
public enum UserSexEnum implements IEnum{
    MAN(1, "男"), WOMAN(2, "女");

    private int key;
    private String value;

    private UserSexEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
