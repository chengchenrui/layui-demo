package com.layui.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author chengchenrui
 * @version Id: User.java, v 0.1 2017.12.13 11:54 chengchenrui Exp $$
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 1679075981069554305L;

    private String            userName;
    private String            userEmail;
    private String            userSex;
    private String            userGrade;
    private String            userStatus;
    private String            userEndTime;

}
