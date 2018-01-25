package com.txx.base;

import java.io.Serializable;

/**
 * 帅气的创建
 * <p>
 * <p>
 * feature;
 */
public class MyResponse<T> implements Serializable{

    private int code;
    private String info;
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
