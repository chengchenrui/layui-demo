package com.layui.model.base;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * @author chengchenrui
 * @version Id: Result.java, v 0.1 2017.12.13 11:51 chengchenrui Exp $$
 */
@Getter
@Setter
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 9098313078767070760L;

    private boolean           success;

    private T                 date;

    private String            error;

    public Result(boolean success, T date) {
        this.success = success;
        this.date = date;
    }

    public Result(boolean success, String error) {
        this.success = success;
        this.error = error;
    }
}
