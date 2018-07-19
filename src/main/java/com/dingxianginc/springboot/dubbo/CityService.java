package com.dingxianginc.springboot.dubbo;


import com.dingxianginc.springboot.domain.City;

/**
 * @Description
 * @Author: jixiang.ma@dingxing-inc.com
 * @Date: 2018/7/18 20:36
 * @Copyright: 2018 dingxiang-inc.com Inc. All rights reserved
 **/


public interface CityService {
    City findCityByName(String cityName);
}
