package com.taki.order.service;

import com.taki.order.domain.dto.CheckLackDTO;
import com.taki.order.domain.dto.LackDTO;
import com.taki.order.domain.request.LackRequest;

/**
 * @ClassName OrderLackService
 * @Description 订单缺品相关 service
 * @Author Long
 * @Date 2022/3/9 15:14
 * @Version 1.0
 */
public interface OrderLackService {



    /** 
     * @description: 校验入参
     * @param lackRequest 缺品请求
     * @return  CheckLackDTO
     * @author Long
     * @date: 2022/3/9 15:22
     */ 
    CheckLackDTO checkRequest(LackRequest lackRequest);


    /** 
     * @description: 具体缺品处理
     * @param lackRequest 缺品请求
     * @param checkLack 检测缺品 DTO
     * @return  缺品 DTO
     * @author Long
     * @date: 2022/3/9 15:27
     */ 
    LackDTO executeLackRequest(LackRequest lackRequest ,CheckLackDTO checkLack);
}
