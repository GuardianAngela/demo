package com.qf.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Description: 用户表
 * @Author: GuardianAngel
 * @Date: 2022/5/26
 * @Version: 1.0
 */
@TableName("t_user")
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -6282972186001809105L;

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String username;
    private String password;
    private Integer age;
    private Double height;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime birthday;
}
