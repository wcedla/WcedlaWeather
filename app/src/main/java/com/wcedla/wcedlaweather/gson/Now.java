package com.wcedla.wcedlaweather.gson;

import com.google.gson.annotations.SerializedName;

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public DetialInfo detialInfo;

    public class DetialInfo
    {
        @SerializedName("txt")
        public String info;
    }
}
