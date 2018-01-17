package com.cloudnew.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by cloud on 2017/11/23.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public  Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
