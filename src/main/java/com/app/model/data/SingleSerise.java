package com.app.model.data;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 单序列
 */

@Data
public class SingleSerise {

    private String name;

    private BigDecimal value;

    public SingleSerise(String name, BigDecimal value) {
        this.name = name;
        this.value = value;
    }
}
