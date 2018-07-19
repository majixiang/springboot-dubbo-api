package com.dingxianginc.springboot.domain;


import java.io.Serializable;

/**
 * @Description
 * @Author: jixiang.ma@dingxing-inc.com
 * @Date: 2018/7/18 20:35
 * @Copyright: 2018 dingxiang-inc.com Inc. All rights reserved
 **/


public class City implements Serializable{
    private String name;
    private String desc;

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public City() {
    }

    public City(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
