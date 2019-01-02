package com.imooc.sell.converter;


import com.imooc.sell.dto.OrderDTO;
import com.imooc.sell.model.OrderMaster;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;


import java.util.List;
import java.util.stream.Collectors;

/**
 * OrderMaster到OrderDTO的转换器
 */

@Slf4j
public class OrderForm2OrderDTOConverter {
    /*public static OrderDTO convert()*/

    /**
     * 一个orderMaster转换成orderDTO
     * @param orderMaster
     * @return
     */
    public static  OrderDTO convert(OrderMaster orderMaster){
        OrderDTO orderDTO = new OrderDTO();
        //将orderMaster中的属性复制到orderDTO
        BeanUtils.copyProperties(orderMaster,orderDTO);
        return orderDTO;
    }

    /**
     * list<OrderMaster> 转换成 List<OrderDTO>
     * @param orderMasterList
     * @return
     */
    public static List<OrderDTO> converList(List<OrderMaster> orderMasterList){
        //java 8新特性
        return  orderMasterList.stream().map(e  ->new OrderDTO()).collect(Collectors.toList());
    }
}
