
package com.alandwiprasetyo.mvp.models;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Epub {

    @SerializedName("acsTokenLink")
    private String mAcsTokenLink;
    @SerializedName("isAvailable")
    private Boolean mIsAvailable;

    public String getAcsTokenLink() {
        return mAcsTokenLink;
    }

    public void setAcsTokenLink(String acsTokenLink) {
        mAcsTokenLink = acsTokenLink;
    }

    public Boolean getIsAvailable() {
        return mIsAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        mIsAvailable = isAvailable;
    }

}
