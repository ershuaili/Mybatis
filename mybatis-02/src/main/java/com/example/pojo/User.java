package com.example.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/05/05 下午 11:21
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
class User {
    private int id;
    private String name;
    private String pwd;
}
