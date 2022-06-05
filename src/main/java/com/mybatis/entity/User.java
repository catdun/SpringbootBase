package com.mybatis.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

@Getter
@Setter
@ToString
public class User implements Serializable {
    private Long id;
    private String name;
    private Integer age;
    // 将Date日期格式化为指定格式的字符串 由于在序列化时间时是按照国际标准时间GMT进行格式化的，
    // 最后接受到的数据会早勒8个小时，所以应该添加timezone = "GMT+8"属性将时区设置为于国内相同的CST时区
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    // 用于指定从前台接受的时间字符串格式，若格式不对应则抛出异常。
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }
}
