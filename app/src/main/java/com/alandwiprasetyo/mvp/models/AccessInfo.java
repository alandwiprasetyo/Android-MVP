
package com.alandwiprasetyo.mvp.models;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class AccessInfo {

    @SerializedName("accessViewStatus")
    private String mAccessViewStatus;
    @SerializedName("country")
    private String mCountry;
    @SerializedName("embeddable")
    private Boolean mEmbeddable;
    @SerializedName("epub")
    private Epub mEpub;
    @SerializedName("pdf")
    private Pdf mPdf;
    @SerializedName("publicDomain")
    private Boolean mPublicDomain;
    @SerializedName("quoteSharingAllowed")
    private Boolean mQuoteSharingAllowed;
    @SerializedName("textToSpeechPermission")
    private String mTextToSpeechPermission;
    @SerializedName("viewability")
    private String mViewability;
    @SerializedName("webReaderLink")
    private String mWebReaderLink;

    public String getAccessViewStatus() {
        return mAccessViewStatus;
    }

    public void setAccessViewStatus(String accessViewStatus) {
        mAccessViewStatus = accessViewStatus;
    }

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public Boolean getEmbeddable() {
        return mEmbeddable;
    }

    public void setEmbeddable(Boolean embeddable) {
        mEmbeddable = embeddable;
    }

    public Epub getEpub() {
        return mEpub;
    }

    public void setEpub(Epub epub) {
        mEpub = epub;
    }

    public Pdf getPdf() {
        return mPdf;
    }

    public void setPdf(Pdf pdf) {
        mPdf = pdf;
    }

    public Boolean getPublicDomain() {
        return mPublicDomain;
    }

    public void setPublicDomain(Boolean publicDomain) {
        mPublicDomain = publicDomain;
    }

    public Boolean getQuoteSharingAllowed() {
        return mQuoteSharingAllowed;
    }

    public void setQuoteSharingAllowed(Boolean quoteSharingAllowed) {
        mQuoteSharingAllowed = quoteSharingAllowed;
    }

    public String getTextToSpeechPermission() {
        return mTextToSpeechPermission;
    }

    public void setTextToSpeechPermission(String textToSpeechPermission) {
        mTextToSpeechPermission = textToSpeechPermission;
    }

    public String getViewability() {
        return mViewability;
    }

    public void setViewability(String viewability) {
        mViewability = viewability;
    }

    public String getWebReaderLink() {
        return mWebReaderLink;
    }

    public void setWebReaderLink(String webReaderLink) {
        mWebReaderLink = webReaderLink;
    }

}
