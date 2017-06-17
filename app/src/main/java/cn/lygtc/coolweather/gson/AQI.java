package cn.lygtc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by student on 2017/6/17.
 */

public class AQI {
    public AQICity city;

    private class AQICity {
        public String aqi;
        public String pm25;

        @SerializedName("qlty")
        public String quality;
    }
}
