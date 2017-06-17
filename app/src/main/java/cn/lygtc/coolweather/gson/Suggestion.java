package cn.lygtc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by student on 2017/6/17.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        public String brf;
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        public String brf;
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        public String brf;
        @SerializedName("txt")
        public String info;
    }
}
