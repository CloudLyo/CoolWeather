package com.cloudnew.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by cloud on 2017/11/23.
 */

public class Weather {
    public String status;

    public Basic basic;

    public Update update;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
