
package com.alandwiprasetyo.mvp.models;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ReadingModes {

    @SerializedName("image")
    private Boolean mImage;
    @SerializedName("text")
    private Boolean mText;

    public Boolean getImage() {
        return mImage;
    }

    public void setImage(Boolean image) {
        mImage = image;
    }

    public Boolean getText() {
        return mText;
    }

    public void setText(Boolean text) {
        mText = text;
    }

}
