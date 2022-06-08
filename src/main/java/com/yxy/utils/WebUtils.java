package com.yxy.utils;

import org.apache.commons.beanutils.BeanUtils;

import java.util.Map;

public class WebUtils {
    public  static <T> T  copyParamTOBean(Map value, T bean){
        try {
//            System.out.println("注入前"+bean);
            /*
            *把所有请求参数注入到bean中
             */
            BeanUtils.populate(bean,value);
//            System.out.println("注入后"+bean);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }

    /**
     *
     * @description: String转换为int
     * @author: yxy
     * @date: 2022/6/7 23:53
     * @param: strInt
     * @param: defaultValue
     * @return: int
     *
     **/


    public static int parseInt(String strInt,int defaultValue){

            try {
                return Integer.parseInt(strInt);
            } catch (Exception e) {



        return defaultValue;
    }
}}
