package com.cloudnew.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by cloud on 2017/11/23.
 */

public class Forecast {
    public String date;

    public String tmp_max;

    public String tmp_min;

    public String cond_txt_d;

    public String getCond_txt_n;

    public String hum;

    public String uv_index;

    public  String vis;


    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
