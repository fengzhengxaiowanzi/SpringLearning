package com.zhang.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: zhangxinjun
 * @description: com.zhang.model
 * @date：Created in 14:37 2021/8/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonLife {
    private String lifeName;
    private Person person;
}
