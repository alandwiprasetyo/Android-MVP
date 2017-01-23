
package com.alandwiprasetyo.mvp.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class VolumeInfo {

    @SerializedName("allowAnonLogging")
    private Boolean mAllowAnonLogging;
    @SerializedName("authors")
    private List<String> mAuthors;
    @SerializedName("averageRating")
    private Double mAverageRating;
    @SerializedName("canonicalVolumeLink")
    private String mCanonicalVolumeLink;
    @SerializedName("categories")
    private List<String> mCategories;
    @SerializedName("contentVersion")
    private String mContentVersion;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("imageLinks")
    private ImageLinks mImageLinks;
    @SerializedName("industryIdentifiers")
    private List<IndustryIdentifier> mIndustryIdentifiers;
    @SerializedName("infoLink")
    private String mInfoLink;
    @SerializedName("language")
    private String mLanguage;
    @SerializedName("maturityRating")
    private String mMaturityRating;
    @SerializedName("pageCount")
    private Long mPageCount;
    @SerializedName("previewLink")
    private String mPreviewLink;
    @SerializedName("printType")
    private String mPrintType;
    @SerializedName("publishedDate")
    private String mPublishedDate;
    @SerializedName("publisher")
    private String mPublisher;
    @SerializedName("ratingsCount")
    private Long mRatingsCount;
    @SerializedName("readingModes")
    private ReadingModes mReadingModes;
    @SerializedName("subtitle")
    private String mSubtitle;
    @SerializedName("title")
    private String mTitle;

    public Boolean getAllowAnonLogging() {
        return mAllowAnonLogging;
    }

    public void setAllowAnonLogging(Boolean allowAnonLogging) {
        mAllowAnonLogging = allowAnonLogging;
    }

    public List<String> getAuthors() {
        return mAuthors;
    }

    public void setAuthors(List<String> authors) {
        mAuthors = authors;
    }

    public Double getAverageRating() {
        return mAverageRating;
    }

    public void setAverageRating(Double averageRating) {
        mAverageRating = averageRating;
    }

    public String getCanonicalVolumeLink() {
        return mCanonicalVolumeLink;
    }

    public void setCanonicalVolumeLink(String canonicalVolumeLink) {
        mCanonicalVolumeLink = canonicalVolumeLink;
    }

    public List<String> getCategories() {
        return mCategories;
    }

    public void setCategories(List<String> categories) {
        mCategories = categories;
    }

    public String getContentVersion() {
        return mContentVersion;
    }

    public void setContentVersion(String contentVersion) {
        mContentVersion = contentVersion;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public ImageLinks getImageLinks() {
        return mImageLinks;
    }

    public void setImageLinks(ImageLinks imageLinks) {
        mImageLinks = imageLinks;
    }

    public List<IndustryIdentifier> getIndustryIdentifiers() {
        return mIndustryIdentifiers;
    }

    public void setIndustryIdentifiers(List<IndustryIdentifier> industryIdentifiers) {
        mIndustryIdentifiers = industryIdentifiers;
    }

    public String getInfoLink() {
        return mInfoLink;
    }

    public void setInfoLink(String infoLink) {
        mInfoLink = infoLink;
    }

    public String getLanguage() {
        return mLanguage;
    }

    public void setLanguage(String language) {
        mLanguage = language;
    }

    public String getMaturityRating() {
        return mMaturityRating;
    }

    public void setMaturityRating(String maturityRating) {
        mMaturityRating = maturityRating;
    }

    public Long getPageCount() {
        return mPageCount;
    }

    public void setPageCount(Long pageCount) {
        mPageCount = pageCount;
    }

    public String getPreviewLink() {
        return mPreviewLink;
    }

    public void setPreviewLink(String previewLink) {
        mPreviewLink = previewLink;
    }

    public String getPrintType() {
        return mPrintType;
    }

    public void setPrintType(String printType) {
        mPrintType = printType;
    }

    public String getPublishedDate() {
        return mPublishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        mPublishedDate = publishedDate;
    }

    public String getPublisher() {
        return mPublisher;
    }

    public void setPublisher(String publisher) {
        mPublisher = publisher;
    }

    public Long getRatingsCount() {
        return mRatingsCount;
    }

    public void setRatingsCount(Long ratingsCount) {
        mRatingsCount = ratingsCount;
    }

    public ReadingModes getReadingModes() {
        return mReadingModes;
    }

    public void setReadingModes(ReadingModes readingModes) {
        mReadingModes = readingModes;
    }

    public String getSubtitle() {
        return mSubtitle;
    }

    public void setSubtitle(String subtitle) {
        mSubtitle = subtitle;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

}
