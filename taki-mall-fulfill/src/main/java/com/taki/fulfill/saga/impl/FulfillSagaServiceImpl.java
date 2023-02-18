package com.taki.fulfill.saga.impl;

import com.alibaba.fastjson.JSONObject;
import com.taki.fulfill.domain.request.ReceiveFulfillRequest;
import com.taki.fulfill.exection.FulfillBizException;
import com.taki.fulfill.saga.FulfillSagaService;
import com.taki.fulfill.service.FulfillService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName FulfillSagaServiceImpl
 * @Description TODO
 * @Author Long
 * @Date 2022/5/16 14:38
 * @Version 1.0
 */
@Service("fulfillSagaService")
@Slf4j
public class FulfillSagaServiceImpl implements FulfillSagaService {

    @Autowired
    private FulfillService fulfillService;


    @Override
    public Boolean createFulfillOrder(ReceiveFulfillRequest request) {
        log.info("创建履约单，request={}", JSONObject.toJSONString(request));

        String fullfillExcetion = request.getFulfillException();
        if (StringUtils.isNotBlank(fullfillExcetion) && fullfillExcetion.equals("true")){
            throw new FulfillBizException("创建履约单异常");
        }

        // 创建履约单
         fulfillService.createFulfillOrder(request);
        return true;
    }

    @Override
    public Boolean createFulfillOrderCompensate(ReceiveFulfillRequest request) {
        log.info("补偿创建履约单，request = {}",JSONObject.toJSONString(request));

        //取消履约单
        fulfillService.cancelFulfillOrder(request.getOrderId());

        log.info("补偿履约单结束， request={}",request);
        return true;
    }
}
