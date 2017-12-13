/**
 * Bestpay.com.cn Inc.
 * Copyright (c) 2011-2017 All Rights Reserved.
 */
package com.layui.model.request;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author chengchenrui
 * @version Id: UserListRequest.java, v 0.1 2017.12.13 17:41 chengchenrui Exp $$
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserListRequest implements Serializable {
    private static final long serialVersionUID = 2463485861021112818L;

    private String            page;

    private String            limit;
}
