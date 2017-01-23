
package com.alandwiprasetyo.mvp.models;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class SearchInfo {

    @SerializedName("textSnippet")
    private String mTextSnippet;

    public String getTextSnippet() {
        return mTextSnippet;
    }

    public void setTextSnippet(String textSnippet) {
        mTextSnippet = textSnippet;
    }

}
