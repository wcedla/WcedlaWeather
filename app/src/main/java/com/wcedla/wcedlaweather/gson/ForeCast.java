package com.wcedla.wcedlaweather.gson;

import com.google.gson.annotations.SerializedName;

public class ForeCast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public DetialInfo detialInfo;

    public class Temperature
    {
        public String min;

        public String max;
    }

    public class DetialInfo
    {
        @SerializedName("txt_d")
        public String info;
    }
}
