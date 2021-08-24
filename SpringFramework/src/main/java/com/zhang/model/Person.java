package com.zhang.model;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author: zhangxinjun
 * @description: com.zhang.model
 * @date：Created in 11:27 2021/8/21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private Integer age;
    private LocalDateTime birth;
    private List<String> hobby;
    private int[] score;
}
