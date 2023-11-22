package com.huahuo.user.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class HotValue implements Serializable {
    Long id;
    Integer value;
}
