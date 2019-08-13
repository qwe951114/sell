package com.imooc.sell.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.imooc.sell.dto.OrderDTO;
import com.imooc.sell.enums.ResultEnum;
import com.imooc.sell.exception.SellException;
import com.imooc.sell.form.OrderForm;
import com.imooc.sell.model.OrderDetail;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author :郭辉
 * @Date:2019/1/3 20:55
 * @Version 1.0
 */

/**
 * 把OrderForm对象转化成OrderDTO
 */
@Slf4j
public class OrderForm2OrderDTOConvert {
    public static OrderDTO convert(OrderForm orderForm){

        Gson gson = new Gson();
        //新建一个OrderDTO对象
        OrderDTO orderDTO = new OrderDTO();
        //不能用BeanUtil来转换
        //姓名
        orderDTO.setBuyerName(orderForm.getName());
        //电话
        orderDTO.setBuyerPhone(orderForm.getPhone());
        //地址
        orderDTO.setBuyerAddress(orderForm.getAddress());
        //买家微信id
        orderDTO.setBuyerOpenid(orderForm.getOpenid());
        //items项
       List<OrderDetail> orderDetailList = new ArrayList<>();
        try {
            gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>() {
                    }.getType());
        }catch (Exception e){
            log.error("【对象转换】 错误，String ={}", orderForm.getItems());
            throw  new SellException(ResultEnum.PARAM_ERROR);
        }
        orderDTO.setOrderDetailList(orderDetailList);
       return orderDTO;
    }
}
