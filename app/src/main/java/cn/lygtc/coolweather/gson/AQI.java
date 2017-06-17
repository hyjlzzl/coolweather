package cn.lygtc.coolweather.gson;

/**
 * Created by student on 2017/6/17.
 */

public class AQI {
    public AQICity city;

    private class AQICity {
        public String aqi;
        public String pm25;
        public String qlty;
    }
}
