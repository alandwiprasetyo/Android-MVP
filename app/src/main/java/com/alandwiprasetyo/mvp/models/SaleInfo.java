
package com.alandwiprasetyo.mvp.models;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class SaleInfo {

    @SerializedName("country")
    private String mCountry;
    @SerializedName("isEbook")
    private Boolean mIsEbook;
    @SerializedName("saleability")
    private String mSaleability;

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public Boolean getIsEbook() {
        return mIsEbook;
    }

    public void setIsEbook(Boolean isEbook) {
        mIsEbook = isEbook;
    }

    public String getSaleability() {
        return mSaleability;
    }

    public void setSaleability(String saleability) {
        mSaleability = saleability;
    }

}
