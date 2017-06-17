package cn.lygtc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by student on 2017/6/17.
 */

public class Forcast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;


    private class Temperature {
        public String max;
        public String min;
    }

    private class More {
        @SerializedName("code_d")
        public String dayCode;
        @SerializedName("txt_d")
        public String dayDesc;
        @SerializedName("code_n")
        public String nightCode;
        @SerializedName("txt_n")
        public String nightDesc;
    }
}
