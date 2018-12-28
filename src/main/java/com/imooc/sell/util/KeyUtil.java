package com.imooc.sell.util;

import java.util.Random;

/**
 * 生成唯一的主键
 * 格式：时间+随机数
 * @return
 */
public  class KeyUtil {
    public static  synchronized String genUniqueKey(){
        //创建随机数
        Random random = new Random();
        //随机产生一个0~900000的数
        Integer number = random.nextInt(900000);
        //当前时间+随机数的组合
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
