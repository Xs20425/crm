package com.zhidisoft.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_system_user")
@Component
public class User {

    private String id;

    private Date createtime;

    private String email;

    private String password;

    private String phone;

    private String salt;

    private Integer sortnum;

    private Integer status;

    private Date updatetime;

    private String usernote;

    private String username;

    private String createby;

    private String updateby;
}