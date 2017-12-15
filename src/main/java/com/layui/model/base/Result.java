package com.layui.model.base;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author chengchenrui
 * @version Id: Result.java, v 0.1 2017.12.13 11:51 chengchenrui Exp $$
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 9098313078767070760L;

    private String            code;

    private String            msg;

    private Integer           count;

    private T                 data;

}
