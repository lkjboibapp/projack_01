package com.example.kuhas.projack_01;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kuhas on 6/2/2561.
 */

public class Contact {


    /**
     * vdo_id : 1
     * vdo_title : The Hobbit 2
     * vdo_path : http://www.youtube.com/watch?v=YUgLgblxHmI
     * create_date : 2013-11-11 13:14:10
     * create_by : 1
     * update_date : 2013-12-18 13:30:30
     * update_by : 1
     * active : n
     */

    @SerializedName("vdo_id")           private String vdoid;
    @SerializedName("vdo_title")        private String vdotitle;
    @SerializedName("vdo_path")         private String vdopath;
    @SerializedName("create_date")      private String createdate;
    @SerializedName("create_by")        private String createby;
    @SerializedName("update_date")      private String updatedate;
    @SerializedName("update_by")        private String updateby;
    @SerializedName("active")           private String active;

    public String getVdoid() {
        return vdoid;
    }

    public String getVdotitle() {
        return vdotitle;
    }

    public String getVdopath() {
        return vdopath;
    }

    public String getCreatedate() {
        return createdate;
    }

    public String getCreateby() {
        return createby;
    }

    public String getUpdatedate() {
        return updatedate;
    }

    public String getUpdateby() {
        return updateby;
    }

    public String getActive() {
        return active;
    }
}
