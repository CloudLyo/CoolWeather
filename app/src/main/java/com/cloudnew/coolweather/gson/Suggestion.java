package com.cloudnew.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by cloud on 2017/11/23.
 */

public class Suggestion {
    @SerializedName("conf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info="默认";
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
