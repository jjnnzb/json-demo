package com.github.jjnnzb.jsondemo.entity;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Jjn
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseBean<T> implements Serializable {

    private static final long serialVersionUID = -3699842403600131110L;
    /**
     * Business code.
     */
    private int code;

    /**
     * Message.
     */
    private String message;

    /**
     * Result data.
     */
    private T data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public static <T> ResponseBean<T> success() {
        return new ResponseBean<>(200, "success", null);
    }

    public static <T> ResponseBean<T> success(T data) {
        return new ResponseBean<>(200, "success", data);
    }

    public static <T> ResponseBean<T> success(T data, String message) {
        return new ResponseBean<>(200, message, data);
    }

    public static <T> ResponseBean<T> error(int code, String message, T data) {
        return new ResponseBean<>(code, message, data);
    }

    public static <T> ResponseBean<T> error(int code, String message) {
        return new ResponseBean<>(code, message, null);
    }

    @SuppressWarnings("rawtypes")
    public static ResponseBean error(String message) {
        return new ResponseBean<>(500, message, null);
    }

}
