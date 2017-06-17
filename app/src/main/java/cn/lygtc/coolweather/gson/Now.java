package cn.lygtc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by student on 2017/6/17.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public Wind wind;

    public class More {
        @SerializedName("txt")
        public String info;

        public String code;

    }

    public class Wind {
        @SerializedName("dir")
        public String direction;

        @SerializedName("sc")
        public String scale;
    }
}
