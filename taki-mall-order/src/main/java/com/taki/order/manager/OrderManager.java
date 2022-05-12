package com.taki.order.manager;


import com.taki.market.domain.dto.CalculateOrderAmountDTO;
import com.taki.order.domain.entity.OrderInfoDO;
import com.taki.order.domain.entity.OrderPaymentDetailDO;
import com.taki.order.domain.request.CreateOrderRequest;
import com.taki.order.domain.request.PayCallbackRequest;
import com.taki.product.domian.dto.ProductSkuDTO;

import java.util.List;

/**
 * @ClassName OrderManager
 * @Description 订单组件
 * @Author Long
 * @Date 2022/5/9 21:07
 * @Version 1.0
 */
public interface OrderManager {

    /**
     * @description: 创建 订单
     * @param createOrderRequest 创建订单请求
     * @param productSkus 商品 SKU 集合
     * @param calculateOrderAmount 计算的订单 费用信息
     * @return  java.lang.Boolean
     * @author Long
     * @date: 2022/5/9 21:12
     */
    Boolean createOrder(CreateOrderRequest createOrderRequest, List<ProductSkuDTO> productSkus, CalculateOrderAmountDTO calculateOrderAmount);


    /**
     * @description: 支付回调修改订单状态
     * @param payCallbackRequest 支付回调请求
     * @param orderInfo 订单数据
     * @param orderPaymentDetail 订单支付详情数据
     * @return  void
     * @author Long
     * @date: 2022/5/12 21:41
     */
    void updateOrderStatusPaid(PayCallbackRequest payCallbackRequest, OrderInfoDO orderInfo, OrderPaymentDetailDO orderPaymentDetail);
}
