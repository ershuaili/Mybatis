package com.example.entity;

import lombok.*;
import org.apache.ibatis.type.Alias;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/05/05 下午 11:21
 *
 * 实体类类提供getter和setter方法
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private int id;
    private String name;
    private String pwd;
}
