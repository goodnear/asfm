package com.txx.entity.common;

import java.io.Serializable;

/**
 * 帅气的创建
 * <p>
 * <p>
 * feature;
 */
public class ResponseData implements Serializable{

    private static final long serialVersionUID = -8907852908701725878L;

    private int code;
    private String info;
    private Object data;

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
