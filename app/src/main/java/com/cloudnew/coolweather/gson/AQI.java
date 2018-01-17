package com.cloudnew.coolweather.gson;

/**
 * Created by cloud on 2017/11/23.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
