package com.cloudnew.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by cloud on 2017/11/23.
 */

public class Basic {
    @SerializedName("parent_city")
    public String cityName;

    @SerializedName("cid")
    public String weatherId;

}
