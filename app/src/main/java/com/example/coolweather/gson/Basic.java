package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by BiZeHao on 2018/1/17.
 */

public class Basic {
    //城市名
    @SerializedName("city")
    public String cityName;
    //城市对应的id
    @SerializedName("id")
    public String weatherId;
    //天气的更新时间
    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
