package com.taki.order.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ReturnGoodsType
 * @Description 订单取消类型枚举
 * @Author Long
 * @Date 2022/4/4 14:11
 * @Version 1.0
 */
public enum ReturnGoodsTypeEnum {

    AFTER_SALE_RETURN_GOODS(1, "售后退货"),
    ;

    private Integer code;

    private String msg;

    ReturnGoodsTypeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static Map<Integer, String> toMap() {
        Map<Integer, String> map = new HashMap<>(16);
        for (ReturnGoodsTypeEnum element : ReturnGoodsTypeEnum.values()) {
            map.put(element.getCode(), element.getMsg());
        }
        return map;
    }

    public static ReturnGoodsTypeEnum getByCode(Integer code) {
        for (ReturnGoodsTypeEnum element : ReturnGoodsTypeEnum.values()) {
            if (code.equals(element.getCode())) {
                return element;
            }
        }
        return null;
    }
}
