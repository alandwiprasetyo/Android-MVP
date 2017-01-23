
package com.alandwiprasetyo.mvp.models;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Item {

    @SerializedName("accessInfo")
    private AccessInfo mAccessInfo;
    @SerializedName("etag")
    private String mEtag;
    @SerializedName("id")
    private String mId;
    @SerializedName("kind")
    private String mKind;
    @SerializedName("saleInfo")
    private SaleInfo mSaleInfo;
    @SerializedName("searchInfo")
    private SearchInfo mSearchInfo;
    @SerializedName("selfLink")
    private String mSelfLink;
    @SerializedName("volumeInfo")
    private VolumeInfo mVolumeInfo;

    public AccessInfo getAccessInfo() {
        return mAccessInfo;
    }

    public void setAccessInfo(AccessInfo accessInfo) {
        mAccessInfo = accessInfo;
    }

    public String getEtag() {
        return mEtag;
    }

    public void setEtag(String etag) {
        mEtag = etag;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getKind() {
        return mKind;
    }

    public void setKind(String kind) {
        mKind = kind;
    }

    public SaleInfo getSaleInfo() {
        return mSaleInfo;
    }

    public void setSaleInfo(SaleInfo saleInfo) {
        mSaleInfo = saleInfo;
    }

    public SearchInfo getSearchInfo() {
        return mSearchInfo;
    }

    public void setSearchInfo(SearchInfo searchInfo) {
        mSearchInfo = searchInfo;
    }

    public String getSelfLink() {
        return mSelfLink;
    }

    public void setSelfLink(String selfLink) {
        mSelfLink = selfLink;
    }

    public VolumeInfo getVolumeInfo() {
        return mVolumeInfo;
    }

    public void setVolumeInfo(VolumeInfo volumeInfo) {
        mVolumeInfo = volumeInfo;
    }

}
